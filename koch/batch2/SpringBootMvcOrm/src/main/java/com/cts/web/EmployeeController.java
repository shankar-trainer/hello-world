package com.cts.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.entity.Employee;
import com.cts.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired 
	EmployeeService employeeService;

	@GetMapping("/")
	public String empForm() {
		return "empform";
	}
	
	@GetMapping("/all")
	public String getAllEmp(ModelMap map) {
		map.addAttribute("emplist",employeeService.showAllEmployee());
		return  "empall";
	}


}
