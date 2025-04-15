package com.cts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.cts.model.Address;
import com.cts.model.Employee;
import com.cts.model.User;

@Configuration
public class ApplicationConfig {

	@Bean
	@Lazy
	//@Scope(scopeName = "prototype")
	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setId(6556565);
		employee.setName("amitesh parsad");
		employee.setSalary(26000);
		return employee;
	}

	@Bean
	@Lazy
	public Address getAdress() {
		return new Address();
	}
	
	@Bean
	public User getUser() {
		return new User();
	}

}
