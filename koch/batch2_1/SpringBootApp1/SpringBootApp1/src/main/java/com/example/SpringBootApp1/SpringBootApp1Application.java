package com.example.SpringBootApp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.model.Employee;

@SpringBootApplication(scanBasePackages = { "com.example.model" })

public class SpringBootApp1Application {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootApp1Application.class, args);
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootApp1Application.class, args);

		Employee bean = ctx.getBean(Employee.class);

		System.out.println(bean);

	}

}
