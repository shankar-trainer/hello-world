package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	Employee employee;


	@GetMapping("/emp1")
	public Employee getEmployee() {
		return employee;
	}
}
