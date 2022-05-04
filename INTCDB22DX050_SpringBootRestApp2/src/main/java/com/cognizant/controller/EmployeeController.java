package com.cognizant.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	static List<Employee> empList;

	static Employee emp[];
	static {
		emp = new Employee[] { new Employee(1001, "ram kumar", 20000), new Employee(1002, "mahendra kumar", 25000),
				new Employee(1003, "amrendra kumar", 10000), new Employee(1004, "suresh kumar", 30000),
				new Employee(1005, "vivke kumar", 1400), };
		empList = new ArrayList<>();
		for (Employee e : emp) {
			empList.add(e);
		}
	}

	@RequestMapping("/{id}")
	@ResponseBody
	// public Employee searchEmployee(@PathVariable int id)
	public Employee searchEmployee(@PathVariable int id) {
		for (Employee e : empList) {
			if (id == e.getId())
				return e;
		}
		return null;
	}

	@RequestMapping("/all")
	public List<Employee> getAllEmployee() {
		return empList;
	}

}
