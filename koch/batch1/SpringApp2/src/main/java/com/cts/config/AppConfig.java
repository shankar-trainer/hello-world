package com.cts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.cts.model.Car;
import com.cts.model.Employee;
import com.cts.model.User;

@Configuration
public class AppConfig {
	
	@Bean
	//@Scope("prototype")
	@Lazy
	public Employee getEmployee() {
		Employee employee=new Employee();
		employee.setEmployeeId(878787);
		employee.setEmployeeName("sumit kumar");
		employee.setEmployeeSalary(20000);
		return employee;
	}
	
	
	@Bean
	@Lazy
	public Car getMyCar() {
	 return new Car();
	}

	@Bean
	public User getUserIntstance() {
		return new User();
	}
	
}
