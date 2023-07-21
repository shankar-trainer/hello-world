package com.coforge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.model.Employee;

@Controller
@RequestMapping
public class MyController {

	@RequestMapping("/hello")
	public String greeting() {
		return "welcome";
	}
	
	@RequestMapping("/empResult")
	public String employeeResult(@RequestParam("id") int id,@RequestParam("name") String name,
			@RequestParam("salary") float salary, ModelMap map
			) {
		
		Employee employee=new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setSalary(salary);
		
		map.addAttribute("employee", employee);
		return "result";
	}
	

	
}
