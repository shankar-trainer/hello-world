package com.cts.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Employee;

@RestController("/")
public class Hello {

	// http://localhost:8080/SpringMvcRest/hello

	@RequestMapping("/hello")
	public String helloworld() {
		return "hello world";
	}

	// http://localhost:8080/SpringMvcRest/employee

	@RequestMapping("/employee")
	public Employee emp1() {
		Employee employee = new Employee();
		employee.setId(10001);
		employee.setName("suresh parsad");
		employee.setSalary(26000);
		return employee;
	}

}
