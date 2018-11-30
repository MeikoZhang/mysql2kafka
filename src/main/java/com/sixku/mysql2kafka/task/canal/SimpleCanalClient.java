package com.sixku.mysql2kafka.task.canal;

import java.net.InetSocketAddress;
import com.alibaba.otter.canal.client.CanalConnector;
import com.alibaba.otter.canal.client.CanalConnectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SimpleCanalClient extends AbstractCanalClient {

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
    CanalRealtimeJob canalRealtimeJob;


    public void run() {

        // 根据ip，直接创建链接，无HA的功能
        CanalConnector connector = CanalConnectors.newSingleConnector(new InetSocketAddress(canal_address, canal_port),
                canal_destination, canal_username, canal_password);

        final SimpleCanalClient clientTest = new SimpleCanalClient();
        clientTest.setConnector(connector);
        // 设置运行需要的参数
        clientTest.setDestination(canal_destination);
        clientTest.setSubscribe(canal_subscribe);
        clientTest.setRealtimeJob(canalRealtimeJob);
        // 运行任务
        clientTest.start();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                logger.info("## stop the canal client");
                clientTest.stop();
            } catch (Throwable e) {
                logger.warn("##something goes wrong when stopping canal:", e);
            } finally {
                logger.info("## canal client is down.");
            }
        }));
    }
}
