package com.example.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Employee;
import com.example.model.EmployeeValidator;

import jakarta.validation.Valid;

@Controller

@RequestMapping("/")
public class EmployeeController {

	@Autowired
	EmployeeValidator validator;

	public EmployeeController(EmployeeValidator validator) {
		this.validator = validator;
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/empform")
	public String employeePage(ModelMap map) {
		Employee employee = new Employee();
		employee.setId(null);
		employee.setName("");
		employee.setSalary(null);
		map.addAttribute("employee", employee);
		return "empform";
	}
	
	@GetMapping("/empaction")
	public String employeePage(@ModelAttribute("employee") @Valid Employee employee, BindingResult result) {

		validator.validate(employee, result);
		if (result.hasErrors()) {
			return "empform";
		} else {
			return "empresult";
		}
	}
	
//	
//	@InitBinder
//	public void InitBinder(WebDataBinder binder) {
//		binder.setValidator(validator);
//		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("dd-MM-yyyy"), true));
//	}


}
