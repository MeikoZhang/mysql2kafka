package com.sixku.mysql2kafka;

import com.alibaba.fastjson.JSON;
import com.sixku.mysql2kafka.vo.KafkaMessage;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.Date;

@SpringBootTest
@RunWith(SpringRunner.class)
public class KafkaSenderTest {

    @Autowired
    private ApplicationContext ctx;

    /**
     * 注入kafka组件
     */
    private KafkaTemplate<String,String> kafkaTemplate;

    /**
     * 初始化kafka bean组建
     */
    @Before
    public void before() {
        kafkaTemplate = ctx.getBean(KafkaTemplate.class);
    }

    public void send(){
        //kafka测试
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
    }

    public void consume(){

    }
}