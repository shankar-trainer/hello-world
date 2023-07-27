package com.abc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employee")
public class EmployeeController {

	@GetMapping("/form")
	public String employeeForm() {
	return "EmployeeForm"; 	
	}
}

