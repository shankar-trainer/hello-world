package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;

@RestController
@RequestMapping("/")
public class EmployeeController {

	@RequestMapping("/")
	public String hello() {
		return "welcome";
	}

	// @RequestMapping("/employee")
	@GetMapping("/employee")
	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setId(767676);
		employee.setName("amit kumar");
		employee.setSalary(45000);
		return employee;
	}

	@GetMapping("/employees")
	public Employee[] getEmployees() {
		
	 Employee employee[]=new Employee[] {
		new Employee(10001, "suman kumar", 67000),	 
		new Employee(10002, "pawan kumar", 68000),	 
		new Employee(10003, "raman kumar", 78000),	 
		new Employee(10003, "shivam kumar", 56000)	 
	 };
	return employee;
	}

}

//http://localhost:9090/employee
