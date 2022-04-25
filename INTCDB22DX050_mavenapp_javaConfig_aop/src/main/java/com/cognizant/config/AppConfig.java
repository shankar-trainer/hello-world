package com.cognizant.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.cognizant.model.Employee;

@Configuration
public class AppConfig {

	@Bean
	@Scope(value = "prototype")
	public Employee getEmployeeBean() {
		Employee emp1=new Employee();
	//	emp1.setId(10001);
		//emp1.setName("amit kumar");
		//emp1.setSalary(12000);
		return emp1;
	} 
}
