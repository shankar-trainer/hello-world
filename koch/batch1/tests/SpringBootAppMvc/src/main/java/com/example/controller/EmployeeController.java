package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Employee;

@Controller
@RequestMapping("/")
public class EmployeeController {

	@GetMapping("/")
	public String welcome() {
		System.out.println("welcome called");
		return "index";
	}
	
	@GetMapping("/empForm")
	public String employeeForm() {
		System.out.println("empform called");
		return "empform";
	}
	
	@GetMapping("/empaction")
	public String employeeSubmit(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("salary") float salary,
			ModelMap map
			) {
		Employee employee=new Employee();
//		employee.setId(id);
//		employee.setName(name);
//		employee.setSalary(salary);
		map.addAttribute("emp", employee);
		
		return "empresult";
	}
	
	
}
