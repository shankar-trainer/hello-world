package com.cts.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

//	@RequestMapping("/emp")
	@GetMapping("/emp")
	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setId(10001);
		employee.setName("depak kumar");
		employee.setSalary(56000);
		return employee;
	}

	@GetMapping("/all")
	public Employee[] getAllEmployee() {
		return employee;
	}

	@GetMapping("/empall")
	public List<Employee> getAllEmployees() {
		return Arrays.asList(employee);
	}	

	static Employee employee[];
	static {

		employee = new Employee[] { new Employee(90001, "suresh kumar", 67000),
				new Employee(90002, "kamlesh kumar", 41000), new Employee(90003, "vimlesh kumar", 53000),
				new Employee(90004, "kamal nayan kumar", 38000), new Employee(90005, "rupak kumar", 78000), };
	}
}

//http://localhost:8080/employee/emp
//http://localhost:8080/employee/all
//http://localhost:8080/employee/empall
