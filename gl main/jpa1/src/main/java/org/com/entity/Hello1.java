package org.com.entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class Hello1 {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=	SpringApplication.run(Hello1.class);
	
	
/*	Employee emp=   ctx.getBean(Employee.class);
	System.out.println(emp.getId());
	System.out.println(emp.getName());*/
	}
	
	
	
}
