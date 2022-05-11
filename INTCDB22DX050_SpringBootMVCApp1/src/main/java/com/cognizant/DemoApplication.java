package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cognizant.model.Employee;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
// /   SpringApplication.run(DemoApplication.class, args);
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		Employee emp = ctx.getBean(Employee.class);
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
	}
}