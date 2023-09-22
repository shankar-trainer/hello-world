package com.coforge.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EmployeeController {

	@Autowired
	Employee employee;
	
	@RequestMapping("/employee")
	public Employee getAllEmployee() {
		return employee;
	}
}
