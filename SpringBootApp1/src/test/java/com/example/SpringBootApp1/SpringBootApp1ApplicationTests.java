package com.example.SpringBootApp1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.model.Employee;

@SpringBootTest
class SpringBootApp1ApplicationTests {

	ApplicationContext ctx;
	Employee emp1;
	@BeforeEach
	public void start() {
		ctx=new AnnotationConfigApplicationContext(Employee.class);
		emp1 = ctx.getBean(Employee.class);
	} 
	
	
	@Test
	void contextLoads() {
	assertEquals(emp1.getId(), 989898);
	assertEquals(emp1.getName(), "subodh sharma");
	assertEquals(emp1.getSalary(), 89000);
	}

}
