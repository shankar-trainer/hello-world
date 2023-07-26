package com.abc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.model.Employee;
import com.abc.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@GetMapping("/search/{id}")
	public Employee searchEmployee(@PathVariable int id) {
		return service.searchEmployee(id);
	}
	
	@GetMapping("/delete/{id}")
	public Employee deleteEmployee(@PathVariable int id) {
		return service.deleteEmployee(id);
	}
	
	
	@GetMapping("/delete/{id}")
	public Employee updateEmployee(@RequestBody Employee e) {
		return service.updateEmployee(e);
	}
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee e) {
		return service.addEmployee(e);
	}
	

	@GetMapping("/all")
	public List<Employee> getAllEmployee() {
		return service.getAllEmployee();
	}
}
