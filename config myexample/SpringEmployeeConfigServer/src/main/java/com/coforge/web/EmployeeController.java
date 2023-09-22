package com.coforge.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.model.Employee;

@RestController
//@RequestMapping("/")
public class EmployeeController {

	@Autowired
	Employee employee;
	
	@RequestMapping("/employee")
	public Employee getAllEmployee() {
		System.out.println("employee ....");
		return employee;
	}
//    //@Value("${welcome.message}")
//	@Value("${welcome.message}")
//	String g;
//	
//	@RequestMapping("/hello")
//	public String welcome() {
//		return  "......"+g;
//	}
}
