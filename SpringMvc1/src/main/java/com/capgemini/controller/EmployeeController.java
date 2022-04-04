package com.capgemini.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.capgemini.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@RequestMapping("/empform")
	public String empForm(ModelMap map) {
		Employee emp=new Employee();
		
		//map.put("emp",emp);
		map.addAttribute("emp", emp);
		return "EmployeeForm";
	}
	
	@RequestMapping("/empAction")
	public String empLogin(@ModelAttribute("emp") @Valid Employee emp,BindingResult binding) {
		if(binding.hasErrors())
			return "EmployeeForm";
		else
			return "EmployeeResult";
	}
}
