package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.cognizant.dao.EmployeeDaoImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public EmployeeDaoImpl getEmpdao() {
		EmployeeDaoImpl dao = new EmployeeDaoImpl();
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		dao.setJdbcTemplate(jdbcTemplate);
		return dao;
	}

	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setPassword("mysql");
		ds.setUrl("jdbc:mysql://localhost:3306/db1");
		ds.setUsername("root");
		return ds;
	}

}