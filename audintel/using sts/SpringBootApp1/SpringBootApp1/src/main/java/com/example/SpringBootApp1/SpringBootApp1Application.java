package com.example.SpringBootApp1;
//package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.model.Employee;

@SpringBootApplication

@ComponentScan(basePackages = {"com.example.model"})
//@Configuration
//@EnableAutoConfiguration
public class SpringBootApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext bean = SpringApplication.run(SpringBootApp1Application.class, args);
	       Employee bean2 = bean.getBean(Employee.class);
	
	       bean2.employeeInfo();
	}

}
