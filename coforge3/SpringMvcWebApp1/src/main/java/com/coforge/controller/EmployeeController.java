package com.coforge.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.model.Employee;
import com.coforge.model.User;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@RequestMapping("/form")
	public ModelAndView welcome(ModelMap map) {
		Employee employee=new Employee();
//		employee.setEmpId(10001);
//		employee.setEmpName("ram kumar");
//		employee.setEmpSalary(40000);
		
		map.addAttribute("employee", employee);
		return  new ModelAndView("EmployeeForm");
	}
	// jsr 303
	@PostMapping("/employeeAction")
	public ModelAndView employeeProcess(@ModelAttribute("employee") @Valid Employee employee,BindingResult result) {
		if(result.hasErrors()) {
			return new ModelAndView("EmployeeForm");
		}
		else {
			return new ModelAndView("result/EmployeeResult");
		}
		
	}
	
}