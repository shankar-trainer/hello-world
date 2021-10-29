package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.model.Employee;

@SpringBootApplication
public class SpringBootApp1 {

	public static void main(String[] args) {
      ConfigurableApplicationContext run = SpringApplication.run(SpringBootApp1.class, args);		
	   Employee bean = run.getBean(Employee.class);
	   
	   System.out.println(bean.getId());
	   System.out.println(bean.getName());
	   System.out.println(bean.getSalary());
	   
	}
   	
}
