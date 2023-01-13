package com.tvscredit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tvscredit.model.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@RequestMapping
	public String  hello() {
		return "hello world";
	}

	//@RequestMapping("/empinfo")
	@GetMapping("/empinfo")
	public Employee getEmployee() {
		Employee employee=new Employee();
		employee.setId(6786776); 		
		employee.setName("Arvind Kumar");; 		
		employee.setSalary(34000);	
		return employee;
	}
	
	//@RequestMapping("/getall")
	@GetMapping("/getall")
	public Employee[] getAllEmployee() {
		return EmployeeData.getEmpdata();
	}
	
	
	@PostMapping("/addRecord")
	public Employee addRecord(@RequestBody   Employee emp) {
	
		 Employee[] empdata = EmployeeData.getEmpdata();
	
		   Employee searchEmployee = searchEmployee(emp.getId());
		    if(searchEmployee==null) {
                     EmployeeData.addEmployee(emp);		    	
		    	return searchEmployee;
		    }
		    return null;
	}
	
	
	@GetMapping("/search/{id}")
	public Employee searchEmployee(@PathVariable("id") int id ) {
		Employee[] empdata = EmployeeData.getEmpdata();
		for(Employee emp:empdata) {
		    if(emp.getId()==id) {
		    return emp; 	
		    }	
		}
		return null;
	}
	
	
}
