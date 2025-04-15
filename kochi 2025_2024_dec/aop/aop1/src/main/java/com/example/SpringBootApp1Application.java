package com.example;

import com.example.model.Calculator;
//import com.example.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class SpringBootApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootApp1Application.class, args);
		Calculator bean1 = run.getBean("calculator", Calculator.class);
		System.out.println("Addition result " + bean1.addition(11, 22));
		System.out.println("Subtraction result " + bean1.subtraction(11, 2));
		System.out.println("multiplication result " + bean1.multiplication(4, 2));
		try {
			System.out.println("Division Result " + bean1.division(4, 0));
		} catch (IllegalAccessException e) {
			System.err.println(e.getMessage());
		}
	}
}
