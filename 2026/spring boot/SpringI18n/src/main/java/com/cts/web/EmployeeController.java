package com.cts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.model.Employee;
import com.cts.service.EmployeeService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/form")
	public String welcome(ModelMap map) {
		map.addAttribute("employee", new Employee());
		return "EmployeeForm";
	}

	@PostMapping("/login")
	public String welcome(@ModelAttribute @Valid Employee employee, BindingResult result) {
		if (result.hasErrors())
			return "EmployeeForm";
		else {
			return "EmployeeResult";
		}
	}

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/add")
	public Employee addEmployee(@ModelAttribute Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@GetMapping("/search")
	public Employee searchEmployeeById(@RequestParam("id") int id) {
		return employeeService.searchEmployeeById(id);
	}

	@GetMapping("/delete")
	public Employee deleteEmployeeById(@RequestParam("id") int id) {
		return employeeService.deleteEmployeeById(id);
	}

}
