package com.easy.archiecture.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.easy.archiecture.config.info.JdbcInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class DataConfig {

    @Resource
    private JdbcInfo jdbcInfo;

    @Bean
    public DataSource getDataSource() throws SQLException {
//        HikariDataSource hikariDataSource = new HikariDataSource();
//        hikariDataSource.setJdbcUrl(jdbcInfo.getUrl());
//        hikariDataSource.setUsername(jdbcInfo.getUsername());
//        hikariDataSource.setPassword(jdbcInfo.getPassword());
//        hikariDataSource.setDriverClassName(jdbcInfo.getDriver());


        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(jdbcInfo.getUrl());
        dataSource.setUsername(jdbcInfo.getUsername());
        dataSource.setPassword(jdbcInfo.getPassword());
        dataSource.setDriverClassName(jdbcInfo.getDriver());
        dataSource.setFilters(jdbcInfo.getFilters());
        dataSource.setConnectionProperties(jdbcInfo.getConnectionProperties());
        return dataSource;
    }


    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
