package com.coforge.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.coforge.dao.EmployeeDaoImpl;

@Configuration
public class SpringAppConfig {

	@Bean
	public DataSource getDataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/db4");
		dataSource.setUsername("root");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setPassword("mysql");
		return dataSource;
	}

	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		return jdbcTemplate;
	}

	@Bean
	public EmployeeDaoImpl getEmployeeDaoImpl() {
		EmployeeDaoImpl daoImpl = new EmployeeDaoImpl();
		daoImpl.setTemplate(getJdbcTemplate());
		return daoImpl;
	}

}
