package com.example.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DatabaseConfig {

    @Profile("dev")
    @Bean
    public DataSource devDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:testdb");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;
    }

    @Profile("prod")
    @Bean
    public DataSource prodDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/db3");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }
    @Profile("qatest")
    @Bean
    public DataSource qatestDataSource() {
    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
    	dataSource.setDriverClassName("org.hsqldb.jdbc.JDBCDriver");
    	dataSource.setUrl("jdbc:hsqldb:mem:testdb");
    	dataSource.setUsername("sa");
    	dataSource.setPassword("root");
    	return dataSource;
    }
    
}
