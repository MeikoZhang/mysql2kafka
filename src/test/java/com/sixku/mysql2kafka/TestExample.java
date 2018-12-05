package com.sixku.mysql2kafka;

import com.sixku.mysql2kafka.dao.ucard_loan.CustomerInfoMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// 获取启动类，加载配置，确定装载 Spring 程序的装载方法，它回去寻找 主配置启动类（被 @SpringBootApplication 注解的）
@SpringBootTest
// 让 JUnit 运行 Spring 的测试环境， 获得 Spring 环境的上下文的支持
@RunWith(SpringRunner.class)
public class TestExample {

    /**
     * Interface to provide configuration for a web application.
     * spring上下文
     */
    @Autowired
    private ApplicationContext ctx;

    /**
     * 自配置的 MockMvc，可以不需要完整启动 HTTP 服务器就可以快速测试 MVC 控制器
     */
    private MockMvc mockMvc;

    /**
     * 注入mapper信息
     */
    private CustomerInfoMapper customerInfoMapper;

    /**
     * 注入kafka组件
     */
    private KafkaTemplate<String,String> kafkaTemplate;

    /**
     * 初始化 MVC 的环境
     * 初始化mapper
     * 初始化kafka bean组建
     */
    @Before
    public void before() {
//        mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
        customerInfoMapper = ctx.getBean(CustomerInfoMapper.class);
        kafkaTemplate = ctx.getBean(KafkaTemplate.class);
    }

    @Test
    public void testCompomet() throws Exception {
        //webMVC测试
        mockMvc
                .perform(MockMvcRequestBuilders.get("/emp") // 测试的相对地址
//                    .accept(MediaType.APPLICATION_JSON_UTF8) // accept response content type
                )
                .andExpect(status().isOk()) // 期待返回状态吗码200
                // JsonPath expression  https://github.com/jayway/JsonPath
                .andExpect(jsonPath("$[1].name").exists()) // 这里是期待返回值是数组，并且第二个值的 name 存在
                .andDo(print()); // 打印返回的 http response 信息

        //Mapper测试
        System.out.println(customerInfoMapper.selectByPrimaryKey(1l));


    }

}
