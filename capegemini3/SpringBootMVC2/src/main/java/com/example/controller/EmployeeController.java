package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Employee;

@Controller
@RequestMapping
public class EmployeeController {
  Logger logger=LoggerFactory.getLogger(EmployeeController.class);
  
	@RequestMapping("/login")
	public String getLogin() {
		logger.info("getLogin with login action method get");
		
		return "loginpage";
	}

	@RequestMapping(value="/login", method = RequestMethod.POST )
	public String postLogin(@RequestParam("id") int id,@RequestParam("name") String name,
			@RequestParam("salary") float salary, ModelMap map
			
			) {
		logger.info("postLogin with login action method= post");
		Employee employee=new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setSalary(salary);
		map.addAttribute("city","new delhi");
		map.put("emp", employee);
		
		return "result";
	}
	
}
