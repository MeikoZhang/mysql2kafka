package com.sixku.mysql2kafka.task.canal;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.otter.canal.protocol.CanalEntry.*;
import com.sixku.mysql2kafka.dao.als7db.IndInfoMapper;
import com.sixku.mysql2kafka.dao.als7db.domain.IndInfo;
import com.sixku.mysql2kafka.dao.als7db.domain.IndInfoExample;
import com.sixku.mysql2kafka.dao.ucard_loan.CustomerInfoMapper;
import com.sixku.mysql2kafka.dao.ucard_loan.OrderInfoMapper;
import com.sixku.mysql2kafka.dao.ucard_loan.domain.CustomerInfo;
import com.sixku.mysql2kafka.dao.ucard_loan.domain.OrderFlow;
import com.sixku.mysql2kafka.dao.ucard_loan.domain.OrderInfo;
import com.sixku.mysql2kafka.vo.BusinessType;
import com.sixku.mysql2kafka.vo.KafkaMessage;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import java.util.Date;
import java.util.List;

/**
 * 实时监控数据库表，并发送到kafka相应topic
 */
@Component
public class DataProcessor {

    private final static Logger logger = LoggerFactory.getLogger(DataProcessor.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private IndInfoMapper indInfoMapper;

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Autowired
    private CustomerInfoMapper customerInfoMapper;

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
//                    printColumn(rowData.getBeforeColumnsList());
                } else if (eventType == EventType.INSERT) {
                    printColumn(rowData.getAfterColumnsList());
                    extractFromRowData(tableName, "insert", rowData);
                } else if (eventType == EventType.UPDATE) {
//                    logger.info("-------> before");
//                    printColumn(rowData.getBeforeColumnsList());
//                    logger.info("-------> after");
//                    printColumn(rowData.getAfterColumnsList());
//                    extractFromRowData(tableName, "update", rowData);
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
                    kafkaBean.setBusinessCustomerId(customerInfo.getCustomerId());
                    kafkaBean.setBusinessOrderId(null);
                    kafkaBean.setBusinessTime(customerInfo.getCreateTime());
                    kafkaBean.setBusinessMoney(null);
                    kafkaBean.setBusinessIsRepeat(null);

                    kafkaBean.setBusinessCreateTime(customerInfo.getCreateTime());
                    kafkaBean.setBusinessUpdateTime(customerInfo.getUpdateTime());

                    //发送注册消息
                    kafkaBean.setBusinessType(BusinessType.REGISTER.getName());
                    kafkaTemplate.send(BusinessType.REGISTER.getName(), JSON.toJSONString(kafkaBean));
                    logger.info("send kafka message ====> topic: {} message: {}",
                            BusinessType.REGISTER.getName(),JSON.toJSONString(kafkaBean));
                }
                break;

            case "order_info":
                //申请、进件
                if("insert".equals(eventType)){
                    OrderInfo orderInfo = RowData2Bean.extract2Object(rowData, OrderInfo.class,"after");
                    CustomerInfo customerInfo = customerInfoMapper.selectByCustomerId(orderInfo.getCustomerId());

                    kafkaBean.setBusinessChannel(customerInfo.getRegisterChannel());
                    kafkaBean.setBusinessCustomerId(orderInfo.getCustomerId());
                    kafkaBean.setBusinessOrderId(orderInfo.getOrderId());
                    kafkaBean.setBusinessTime(orderInfo.getCreateTime());
                    kafkaBean.setBusinessMoney(String.valueOf(orderInfo.getApplySum()));
                    kafkaBean.setBusinessIsRepeat(null);

                    kafkaBean.setBusinessCreateTime(orderInfo.getCreateTime());
                    kafkaBean.setBusinessUpdateTime(orderInfo.getUpdateTime());

                    //申请
                    kafkaBean.setBusinessType(BusinessType.APPLY.getName());
                    kafkaTemplate.send(BusinessType.APPLY.getName(), JSON.toJSONString(kafkaBean));
                    logger.info("send kafka message ====> topic: {} message: {}",
                            BusinessType.APPLY.getName(),JSON.toJSONString(kafkaBean));

                    //进件
                    if(!"80,81".contains(orderInfo.getOrderStatus())){
                        kafkaBean.setBusinessType(BusinessType.LOAN.getName());
                        kafkaTemplate.send(BusinessType.LOAN.getName(), JSON.toJSONString(kafkaBean));
                        logger.info("send kafka message ====> topic: {} message: {}",
                                BusinessType.LOAN.getName(),JSON.toJSONString(kafkaBean));
                    }
                }
                break;

            case "order_flow":
                //审批、签约、放款
                if("insert".equals(eventType)){
//                    printColumn(rowData.getBeforeColumnsList());
//                    printColumn(rowData.getAfterColumnsList());
//                    OrderInfo beforeOrderInfo = RowData2Bean.extract2Object(rowData, OrderInfo.class,"before");
//                    OrderInfo afterOrderInfo = RowData2Bean.extract2Object(rowData, OrderInfo.class,"after");
//                    System.out.println(JSON.toJSONString(beforeOrderInfo));
//                    System.out.println(JSON.toJSONString(afterOrderInfo));
                    OrderFlow orderFolow = RowData2Bean.extract2Object(rowData, OrderFlow.class, "after");
                    OrderInfo orderInfo = orderInfoMapper.selectByOrderId(orderFolow.getOrderId());
                    CustomerInfo customerInfo = customerInfoMapper.selectByCustomerId(orderInfo.getCustomerId());

                    kafkaBean.setBusinessChannel(customerInfo.getRegisterChannel());
                    kafkaBean.setBusinessCustomerId(orderInfo.getCustomerId());
                    kafkaBean.setBusinessOrderId(orderInfo.getOrderId());
                    //是否复贷
                    kafkaBean.setBusinessIsRepeat(getCusomerFromIndinfo(orderInfo.getCertId()));

                    kafkaBean.setBusinessTime(orderFolow.getCreateTime());
                    kafkaBean.setBusinessCreateTime(orderFolow.getCreateTime());
                    kafkaBean.setBusinessUpdateTime(orderFolow.getUpdateTime());

                    //审批通过
                    if("10".equals(orderFolow.getEndStatus())){
                        kafkaBean.setBusinessType(BusinessType.APPROVAL.getName());
                        kafkaBean.setBusinessMoney(String.valueOf(orderInfo.getApproveSum()));
                        kafkaTemplate.send(BusinessType.APPROVAL.getName(), JSON.toJSONString(kafkaBean));
                        logger.info("send kafka message ====> topic: {} message: {}",
                                BusinessType.APPROVAL.getName(),JSON.toJSONString(kafkaBean));
                    }

                    //签约
                    if("20".equals(orderFolow.getEndStatus())){
                        kafkaBean.setBusinessType(BusinessType.CONTRACT.getName());
                        kafkaBean.setBusinessMoney(String.valueOf(orderInfo.getApproveSum()));
                        kafkaTemplate.send(BusinessType.CONTRACT.getName(), JSON.toJSONString(kafkaBean));
                        logger.info("send kafka message ====> topic: {} message: {}",
                                BusinessType.CONTRACT.getName(),JSON.toJSONString(kafkaBean));
                    }

                    //放款成功
                    if("30,33".contains(orderFolow.getEndStatus())){
                        kafkaBean.setBusinessType(BusinessType.PUTOUT.getName());
                        kafkaBean.setBusinessMoney(String.valueOf(orderInfo.getApproveSum()));
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

        IndInfoExample indInfoExample = new IndInfoExample();
        IndInfoExample.Criteria criteria = indInfoExample.createCriteria();
        criteria.andCertidEqualTo(certid);

        List<IndInfo> indInfos = indInfoMapper.selectByExample(indInfoExample);
        //复贷人员判断
        if(indInfos != null && indInfos.size() > 0){
            return "1";//复贷人员
        }else{
            return "0";//非复贷人员
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