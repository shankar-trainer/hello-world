package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	static Employee emp[];
	static {
		emp = new Employee[] {
				new Employee(10003, "amit kumar", 35000.0f),
				new Employee(10004, "sumit kumar", 15000.0f),
				new Employee(10005, "jayant kumar", 45000.0f),
				new Employee(10006, "gagan kumar", 65000.0f),
				new Employee(10007, "suraj kumar", 85000.0f),
				new Employee(10008, "bobby kumar", 95000.0f)
		};
	}

	List<Employee> empList=Arrays.asList(emp);
	
	@RequestMapping("/getall")
	public List<Employee> getAllEmployee() {
		return empList;
	}

}
