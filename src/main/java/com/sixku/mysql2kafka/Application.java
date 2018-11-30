package com.sixku.mysql2kafka;

import com.sixku.mysql2kafka.task.canal.CanalRealtimeJob;
import com.sixku.mysql2kafka.task.canal.SimpleCanalClient;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;

/**
 * Spring Boot 启动类
 */
@SpringBootApplication
@MapperScan(value = "com.sixku.mysql2kafka.dao")
public class Application implements ApplicationRunner {

    private final static Logger logger = LoggerFactory.getLogger(Application.class);

    @Autowired
    private CanalRealtimeJob canalRealtimeJob;

    @Autowired
    SimpleCanalClient simpleCanalClient;

    @Autowired
    ConfigurableApplicationContext ctx;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args).close();
    }

    @EventListener
    public void eventApplicationListener(ApplicationEvent applicationEvent) throws Exception{
        if(applicationEvent instanceof ApplicationReadyEvent){
            logger.info("~~~~~~~正在启动服务~~~~~~~~~");
//            server.start(port);
        }else if(applicationEvent instanceof ContextClosedEvent){
            logger.info("~~~~~~~正在关闭服务~~~~~~~~~");
        }
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        simpleCanalClient.run();
//        canalRealtimeJob.run();
    }
}