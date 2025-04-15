package com.cts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.cts.model.Department;
import com.cts.model.Employee;
import com.cts.model.RegularEmployee;
import com.cts.model.SpecialEmployee;

@Configuration
public class ApplicationConfig {

	@Bean
	public Department getDepartment() {
		return new Department();
	}
	
	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
	
	@Bean
	public SpecialEmployee getSpecialEmployee() {
		return new SpecialEmployee();
	}
	@Bean
	public RegularEmployee getRegularEmployee() {
		return new RegularEmployee();
	}
	
}
