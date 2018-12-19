package com.sixku.mysql2kafka.kafka;

import com.alibaba.fastjson.JSONObject;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.*;

public class KafkaTest {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        Properties properties = new Properties();
        //key反序列化方式
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
                StringDeserializer.class.getCanonicalName());
        //value反系列化方式
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
                StringDeserializer.class.getCanonicalName());
        //自动提交
        properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG,true);
        //指定broker地址，来找到group的coordinator
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,
                "172.16.25.75:6667,172.16.25.76:6667,172.16.25.77:6667");
        //指定用户组
        properties.put(ConsumerConfig.GROUP_ID_CONFIG,"MsgConsumer");
        //
        properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"latest");

        //初始化consumer
        KafkaConsumer<String,String> consumer = new KafkaConsumer<String, String>(properties);
        consumer.subscribe(Arrays.asList("eloan"));

        //从kafka提取数据,放到对应queue中
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(100);//100ms 拉取一次数据
            for (ConsumerRecord<String, String> record : records) {
//                System.out.println("topic: "+record.topic() + " key: " + record.key() + " value: " + record.value() + " partition: "+ record.partition());
                JSONObject jsonObject = JSONObject.parseObject(record.value());
                if(jsonObject.getInteger("t") != 5){
                    Integer lid = map.get(jsonObject.getString("lid"));
                    if(lid == null){lid = 0;}
                    map.put(jsonObject.getString("lid"),lid++);
                    if(map.size() % 20 == 0){
                        System.out.println("map size : "+map.size());
                    }
                    if(lid > 1){
                        System.out.println("key :::::::"+jsonObject.getString("lid")+
                                "  count::::::::::"+ lid);
                    }
                }
            }
        }
    }
}
