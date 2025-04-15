package com.cognizant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;
import com.cognizant.model.Employee;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@RequestMapping("/empForm")
	public String EmployeeForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "EmployeeForm";
	}

	@RequestMapping("/EmployeeAction")
	public String EmployeeFormProcess(@ModelAttribute("employee") @Valid Employee employee, BindingResult result) {
	  if (result.hasErrors())
		  return "EmployeeForm";
	  else
		  return "EmployeeResult";
	}

}
