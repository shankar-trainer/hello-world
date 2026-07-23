package com.coforge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.coforge.model.Department;

@Configuration
@ComponentScan(value = {"com.coforge.model","com.coforge.service"})
public class AppConfig {

	@Bean
	@Lazy(value = true)
	public Department getDepartmentBean() {
		return new Department();
	}
	
	
}
 