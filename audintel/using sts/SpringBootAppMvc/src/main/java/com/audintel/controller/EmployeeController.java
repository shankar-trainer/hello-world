package com.audintel.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.audintel.dao.EmployeeRepository;
import com.audintel.model.Employee;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;

	@RequestMapping("/eform")
	public String empForm(Model map) {
		Employee emp = new Employee();
		map.addAttribute("emp", emp);
		return "employeeForm";
	}

	@PostMapping("/empAction")
	public String employeeProcess(@ModelAttribute("emp") @Valid Employee emp, BindingResult result,
			@RequestParam("submit") String submit, ModelMap map) {
		map.addAttribute("submit", submit);

		if (submit.equals("getAllEmployeeRecord")) {
			List<Employee> findAll = repository.findAll();
			map.addAttribute("empList", findAll);
			return "empResult";
		} else if (submit.equals("send")) {
			if (result.hasErrors())
				return "employeeForm";
			else
				return "empResult";
		}
		return null;
	}
	
	@GetMapping("/empAction1")
	public String employeeProcess(@ModelAttribute("emp") @Valid Employee emp, BindingResult result,
			ModelMap map) {
			List<Employee> findAll = repository.findAll();
			map.addAttribute("empList", findAll);
     	return "empResult1";		
	}

}
