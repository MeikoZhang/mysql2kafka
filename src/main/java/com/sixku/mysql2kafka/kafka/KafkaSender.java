package com.sixku.mysql2kafka.kafka;

import com.alibaba.fastjson.JSON;
import com.sixku.mysql2kafka.vo.KafkaMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * kafkaSender示例
 */
//@Component
public class KafkaSender {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    //发送消息方法
    public void send() {
        KafkaMessage kafkaMessage = new KafkaMessage();
        kafkaMessage.setEventTable("customer_info");
        kafkaMessage.setEventTime(new Date());
        kafkaMessage.setEventType("insert");
        kafkaMessage.setBusinessChannel("channel_code");
        kafkaMessage.setBusinessType("register");
        kafkaMessage.setBusinessCustomerId("customer_id");
        kafkaMessage.setBusinessOrderId("loan_apply_id");
        kafkaMessage.setBusinessTime(new Date());
        kafkaMessage.setBusinessMoney("1000");
        kafkaMessage.setBusinessIsRepeat("0");
        kafkaMessage.setBusinessCreateTime(new Date());
        kafkaMessage.setBusinessUpdateTime(new Date());
        kafkaTemplate.send("test-topic", JSON.toJSONString(kafkaMessage));
        System.out.println("+++++++++++++++++++++  message = " + JSON.toJSONString(kafkaMessage));
        kafkaTemplate.send("zhisheng", JSON.toJSONString(kafkaMessage));
    }
}
