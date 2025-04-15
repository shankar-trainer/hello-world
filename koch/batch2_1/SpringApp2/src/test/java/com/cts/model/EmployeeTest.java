package com.cts.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.config.ApplicationConfig;

public class EmployeeTest {

	ApplicationContext ctx;
	Employee employee;
	
	@BeforeEach
	public void setup() {
		ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		employee=ctx.getBean(Employee.class);
	}
	
	@Test
	public void empTest1() {
		assertNotNull(employee);
		assertEquals(employee.getId(), 8998989);
		assertEquals(employee.getName(), "augustya");
		assertEquals(employee.getSalary(), 56000.0f);
	}
	@Test
	public void empTestAddress() {
	 Address address = employee.getAddress();
	 
	}
	
}
