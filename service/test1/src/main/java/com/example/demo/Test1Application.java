package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.exam.service.EmployeeService;
import com.example.model.Employee;

@SpringBootApplication
@ComponentScan(basePackages = { "com.exam.dao", "com.exam.service", "com.exam.model" })
public class Test1Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Test1Application.class, args);
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);

		//EmployeeService employeeService = ctx.getBean("empservice", EmployeeService.class);
		for (Employee employee : employeeService.myEmployee())
			System.out.println(employee);
	}

}
