package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Employee;

@RestController
@RequestMapping("/")
public class EmployeeController {

	@Autowired
	Employee employee;
	
	@RequestMapping("/employee")
	public Employee getEmployee() {
		return employee;
	}
}
