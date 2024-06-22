package com.coforge.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.coforge.dao.CustomerDaoImpl;

@Configuration
public class JdbcConfig {

	@Bean
	public DataSource getDataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setPassword("mysql");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/db4");
		dataSource.setUsername("root");
		return dataSource;
	}

	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}

	@Bean
	public CustomerDaoImpl getCustomerDaoImpl() {
		CustomerDaoImpl customerDaoImpl = new CustomerDaoImpl();
		customerDaoImpl.setTemplate(getJdbcTemplate());
		return customerDaoImpl;
	}

}
