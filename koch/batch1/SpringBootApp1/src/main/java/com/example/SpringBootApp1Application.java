//package com.example.demo;
package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.model.Employee;

@SpringBootApplication//(scanBasePackages = {"com.example.model"})


public class SpringBootApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootApp1Application.class, args);
		
	Employee employee=	ctx.getBean(Employee.class);
		System.out.println(employee);
	}

}
/*
 com.example.model
 com.example -- main
 
 com.example.demo

*/