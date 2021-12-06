package com.haylou.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @program: demo
 * @description:
 * @author: yang
 * @create: 2021-01-26 19:16
 */
@Configuration
public class DruidConfig {
    @Resource
    private JdbcParamConfig jdbcParamConfig ;
    @Bean
    public DataSource dataSource() {
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(jdbcParamConfig.getUrl());
        datasource.setDriverClassName(jdbcParamConfig.getDriverClassName());
        datasource.setInitialSize(jdbcParamConfig.getInitialSize());
        datasource.setMinIdle(jdbcParamConfig.getMinIdle());
        datasource.setMaxActive(jdbcParamConfig.getMaxActive());
        datasource.setMaxWait(jdbcParamConfig.getMaxWait());
        datasource.setUsername(jdbcParamConfig.getUsername());
        datasource.setValidationQuery(jdbcParamConfig.getValidationQuery());
        datasource.setTestOnBorrow(jdbcParamConfig.isTestOnBorrow());
        datasource.setTestOnReturn(jdbcParamConfig.isTestOnReturn());
        datasource.setTestWhileIdle(jdbcParamConfig.isTestWhileIdle());
        return datasource;
    }
}