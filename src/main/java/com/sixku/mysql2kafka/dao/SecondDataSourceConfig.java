package com.sixku.mysql2kafka.dao;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan(basePackages = "com.sixku.mysql2kafka.dao.ucard_loan", sqlSessionTemplateRef  = "secondSqlSessionTemplate")
public class SecondDataSourceConfig {

    @Bean(name = "secondDataSource")
    @ConfigurationProperties(prefix = "ucard.datasource")
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "secondSqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("secondDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:com/sixku/mysql2kafka/dao/ucard_loan/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "secondTransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("secondDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "secondSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("secondSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
