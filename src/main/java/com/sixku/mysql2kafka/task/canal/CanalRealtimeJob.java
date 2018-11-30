package com.sixku.mysql2kafka.task.canal;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.otter.canal.client.CanalConnector;
import com.alibaba.otter.canal.client.CanalConnectors;
import com.alibaba.otter.canal.protocol.CanalEntry.*;
import com.alibaba.otter.canal.protocol.Message;
import com.sixku.mysql2kafka.dao.CustomerInfoMapper;
import com.sixku.mysql2kafka.dao.domain.CustomerInfo;
import com.sixku.mysql2kafka.dao.domain.OrderInfo;
import com.sixku.mysql2kafka.vo.BusinessType;
import com.sixku.mysql2kafka.vo.KafkaMessage;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import java.net.InetSocketAddress;
import java.util.Date;
import java.util.List;

/**
 * 实时监控数据库表，并发送到kafka相应topic
 */
@Component
public class CanalRealtimeJob {

    private final static Logger logger = LoggerFactory.getLogger(CanalRealtimeJob.class);

    @Value("${canal_address}")
    private String canal_address;
    @Value("${canal_port}")
    private Integer canal_port;
    @Value("${canal_destination}")
    private String canal_destination;
    @Value("${canal_username}")
    private String canal_username;
    @Value("${canal_password}")
    private String canal_password;
    @Value("${canal_batchSize}")
    private Integer canal_batchSize;
    @Value("${canal_subscribe}")
    private String canal_subscribe;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private CustomerInfoMapper customerInfoMapper;

    public void run(){

        // 创建链接
        CanalConnector connector = CanalConnectors
                .newSingleConnector(new InetSocketAddress(canal_address,canal_port)
                        , canal_destination, canal_username, canal_password);
        int batchSize = canal_batchSize;
        try {
            connector.connect();
            //订阅 监控的 数据库.表
//            connector.subscribe(".*\\..*");
            connector.subscribe(canal_subscribe);
            while (true) {
                Message message = connector.getWithoutAck(batchSize); // 获取指定数量的数据
                long batchId = message.getId();
                int size = message.getEntries().size();
                if (batchId == -1 || size == 0) {
                    //nothing
                } else {
                    logger.debug("message[batchId={},size={}] \n", batchId, size);
                    process(message.getEntries());
                }
                connector.ack(batchId); // 提交确认
                // connector.rollback(batchId); // 处理失败, 回滚数据
            }
        } catch (Exception e){
            logger.error("process error!", e);
        } finally {
            connector.disconnect();
            logger.info("process over!");
        }
    }


    public void process(List<Entry> entrys) throws Exception{
        for (Entry entry : entrys) {
            if (entry.getEntryType() == EntryType.TRANSACTIONBEGIN
                    || entry.getEntryType() == EntryType.TRANSACTIONEND) {
                logger.debug("message is transaction ...");
                continue;
            }

            RowChange rowChage = null;

            rowChage = RowChange.parseFrom(entry.getStoreValue());

            EventType eventType = rowChage.getEventType();
            String tableName = entry.getHeader().getTableName();

            logger.info("================> binlog[{}:{}] , name[{},{}] , eventType : {}",
                    entry.getHeader().getLogfileName(), entry.getHeader().getLogfileOffset(),
                    entry.getHeader().getSchemaName(), entry.getHeader().getTableName(),
                    eventType);

            for (RowData rowData : rowChage.getRowDatasList()) {

                if (eventType == EventType.DELETE) {
                    printColumn(rowData.getBeforeColumnsList());
                } else if (eventType == EventType.INSERT) {
                    printColumn(rowData.getAfterColumnsList());
                    extractFromRowData(tableName, "insert", rowData);
                } else if (eventType == EventType.UPDATE) {
                    logger.info("-------> before");
                    printColumn(rowData.getBeforeColumnsList());
                    logger.info("-------> after");
                    printColumn(rowData.getAfterColumnsList());
                    extractFromRowData(tableName, "update", rowData);
                }else {
                    logger.debug("event type-------> "+ eventType);
                    logger.debug("-------> before");
                    printColumn(rowData.getBeforeColumnsList());
                    logger.debug("-------> after");
                    printColumn(rowData.getAfterColumnsList());
                }
            }
        }
    }


    private static String getPrintString(List<Column> columns){
        JSONObject json = new JSONObject();
        for (Column column : columns) {
            json.put(column.getName(),column.getValue());
        }
        return json.toJSONString();
    }

    public static void debugColumn(List<Column> columns) {
        logger.debug(getPrintString(columns));
    }

    public static void printColumn(List<Column> columns) {
        logger.info(getPrintString(columns));
    }

    private static void errorColumn(List<Column> columns) {
        logger.error(getPrintString(columns));
    }


    /**
     * 从rowdata中解析出kafka发送消息对象
     * @return
     */
    public KafkaMessage extractFromRowData(String tableName, String eventType, RowData rowData) throws Exception {

        KafkaMessage kafkaBean = new KafkaMessage();
        kafkaBean.setEventTable(tableName);
        kafkaBean.setEventType(eventType);
        kafkaBean.setEventTime(new Date());

        switch(tableName){
            case "customer_info":
                //注册
                if("insert".equals(eventType)){
                    CustomerInfo customerInfo = RowData2Bean.extract2Object(rowData, CustomerInfo.class,"after");
                    kafkaBean.setBusinessChannel(customerInfo.getRegisterChannel());
                    kafkaBean.setBusinessType(BusinessType.REGISTER.getName());
                    kafkaBean.setBusinessCustomerId(customerInfo.getCustomerId());
                    kafkaBean.setBusinessOrderId(null);
                    kafkaBean.setBusinessTime(customerInfo.getCreateTime());
                    kafkaBean.setBusinessMoney(null);
                    kafkaBean.setBusinessIsRepeat(null);

                    kafkaBean.setBusinessCreateTime(customerInfo.getCreateTime());
                    kafkaBean.setBusinessUpdateTime(customerInfo.getUpdateTime());
                    //发送注册消息
                    kafkaTemplate.send(BusinessType.REGISTER.getName(), JSON.toJSONString(kafkaBean));
                    logger.info("send kafka message ====> topic: {} message: {}",
                            BusinessType.REGISTER.getName(),JSON.toJSONString(kafkaBean));
                }
                break;

            case "order_info":
                //申请、进件
                if("insert".equals(eventType)){
                    OrderInfo orderInfo = RowData2Bean.extract2Object(rowData, OrderInfo.class,"after");
                    kafkaBean.setBusinessChannel(null);
                    kafkaBean.setBusinessType(BusinessType.APPLY.getName());
                    kafkaBean.setBusinessCustomerId(orderInfo.getCustomerId());
                    kafkaBean.setBusinessOrderId(orderInfo.getOrderId());
                    kafkaBean.setBusinessTime(orderInfo.getCreateTime());
                    kafkaBean.setBusinessMoney(String.valueOf(orderInfo.getApplySum()));
                    kafkaBean.setBusinessIsRepeat(null);

                    kafkaBean.setBusinessCreateTime(orderInfo.getCreateTime());
                    kafkaBean.setBusinessUpdateTime(orderInfo.getUpdateTime());
                    kafkaTemplate.send(BusinessType.APPLY.getName(), JSON.toJSONString(kafkaBean));
                    logger.info("send kafka message ====> topic: {} message: {}",
                            BusinessType.APPLY.getName(),JSON.toJSONString(kafkaBean));
                    if(!"80,81".contains(orderInfo.getOrderStatus())){
                        //进件
                        kafkaTemplate.send(BusinessType.LOAN.getName(), JSON.toJSONString(kafkaBean));
                        logger.info("send kafka message ====> topic: {} message: {}",
                                BusinessType.LOAN.getName(),JSON.toJSONString(kafkaBean));
                    }
                }

                //审批、签约、放款
                if("update".equals(eventType)){
                    OrderInfo beforeOrderInfo = RowData2Bean.extract2Object(rowData, OrderInfo.class,"before");
                    OrderInfo afterOrderInfo = RowData2Bean.extract2Object(rowData, OrderInfo.class,"after");

                    kafkaBean.setBusinessChannel(null);
                    kafkaBean.setBusinessType(BusinessType.APPROVAL.getName());
                    kafkaBean.setBusinessCustomerId(afterOrderInfo.getCustomerId());
                    kafkaBean.setBusinessOrderId(afterOrderInfo.getOrderId());
                    kafkaBean.setBusinessTime(afterOrderInfo.getUpdateTime());
                    //是否复贷
                    kafkaBean.setBusinessIsRepeat(getCusomerFromIndinfo(afterOrderInfo.getCertId()));

                    kafkaBean.setBusinessCreateTime(afterOrderInfo.getCreateTime());
                    kafkaBean.setBusinessUpdateTime(afterOrderInfo.getUpdateTime());

                    //审批通过
                    if("10".equals(afterOrderInfo.getOrderStatus()) && !"10".equals(beforeOrderInfo.getOrderStatus())){
                        kafkaBean.setBusinessMoney(String.valueOf(afterOrderInfo.getApproveSum()));
                        kafkaTemplate.send(BusinessType.APPROVAL.getName(), JSON.toJSONString(kafkaBean));
                        logger.info("send kafka message ====> topic: {} message: {}",
                                BusinessType.APPROVAL.getName(),JSON.toJSONString(kafkaBean));
                    }

                    //签约
                    if("20".equals(afterOrderInfo.getOrderStatus()) && !"20".equals(beforeOrderInfo.getOrderStatus())){
                        kafkaBean.setBusinessMoney(String.valueOf(afterOrderInfo.getApproveSum()));
                        kafkaTemplate.send(BusinessType.CONTRACT.getName(), JSON.toJSONString(kafkaBean));
                        logger.info("send kafka message ====> topic: {} message: {}",
                                BusinessType.CONTRACT.getName(),JSON.toJSONString(kafkaBean));
                    }

                    //放款成功
                    if("30,33".contains(afterOrderInfo.getOrderStatus()) && !"30,33".contains(beforeOrderInfo.getOrderStatus())){
                        kafkaBean.setBusinessMoney(String.valueOf(afterOrderInfo.getApproveSum()));
                        kafkaTemplate.send(BusinessType.PUTOUT.getName(), JSON.toJSONString(kafkaBean));
                        logger.info("send kafka message ====> topic: {} message: {}",
                                BusinessType.PUTOUT.getName(),JSON.toJSONString(kafkaBean));
                    }
                }
                break;
            default:
                logger.info("event not in process table ,pass ...");
                break;
        }
        return kafkaBean;
    }


    /**
     * 从ind_info中查询是否是复贷人员
     * @param certid
     * @return
     */
    public String getCusomerFromIndinfo(String certid){
        if(StringUtils.isBlank(certid)){
            return null;
        }

        String cusomerFromIndinfo = customerInfoMapper.selectIndinfo(certid);
        //复贷人员判断
        if(StringUtils.isBlank(cusomerFromIndinfo)){
            return "0";
        }else{
            return "1";
        }
    }

    public static void main(String args[]) {
        KafkaMessage kafkaBean = new KafkaMessage();
        kafkaBean.setEventTable("customer_info");
        kafkaBean.setEventType("insert");
        kafkaBean.setEventTime(new Date());
        kafkaBean.setBusinessChannel("11111111");
        kafkaBean.setBusinessType("register");
        kafkaBean.setBusinessCustomerId("1111111111111111111");
        kafkaBean.setBusinessOrderId("201611111111111111111111");
        kafkaBean.setBusinessTime(new Date());
        kafkaBean.setBusinessMoney("1000.00");
        kafkaBean.setBusinessIsRepeat("1");
        kafkaBean.setBusinessCreateTime(new Date());
        kafkaBean.setBusinessUpdateTime(new Date());
        System.out.println(JSON.toJSONString(kafkaBean));
    }

}