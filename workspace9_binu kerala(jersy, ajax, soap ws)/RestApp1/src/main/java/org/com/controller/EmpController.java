package org.com.controller;

import org.com.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmpController {

	@GetMapping("/emp")
	public Employee getEmp() {
		Employee employee = new Employee();
		employee.setId(1001);
		employee.setName("moha kumar");
		employee.setId(50000);

		return employee;
	}

}
