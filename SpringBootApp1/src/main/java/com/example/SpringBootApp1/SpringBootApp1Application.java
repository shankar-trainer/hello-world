package com.example.SpringBootApp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.model.Employee;

@SpringBootApplication(scanBasePackages = "com.example.model")

//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan(basePackages = "com.example.model")

public class SpringBootApp1Application {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootApp1Application.class, args);
		ConfigurableApplicationContext context = 
				SpringApplication.run(SpringBootApp1Application.class, args);
		
		Employee employee = context.getBean(Employee.class);
		
		System.out.println(employee);
		context.close();
	}

}
