package com.cg.DemoConfigurationManagement.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.DemoConfigurationManagement.dto.Employee;
import com.cg.DemoConfigurationManagement.service.EmployeeService;
@RestController

//@RequestMapping("/emp")
public class EmployeeController {
	Logger log=LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	EmployeeService employeeServiceimpl;
	
	@PostMapping(value="/addemp")
	public ResponseEntity<Employee> addData(@RequestBody Employee emp){
	Employee empData=employeeServiceimpl.addEmployee(emp);
		 return new ResponseEntity<Employee>(empData,HttpStatus.OK);
		
	}
	@GetMapping(value="/showemp")
	public ResponseEntity<List<Employee>> showData(){
	return new ResponseEntity<List<Employee>>(employeeServiceimpl.showEmployee(),HttpStatus.OK);
		
	}
}

