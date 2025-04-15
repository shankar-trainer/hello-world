package com.example.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Employee;
import com.example.model.EmployeeValidator;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class EmployeeController {
	
	//static Logger logger=LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	EmployeeValidator validator;

	public EmployeeController(EmployeeValidator validator) {
		this.validator = validator;
	}

	@GetMapping("/")
	public String index() {
		//logger.info("index page loads");
		log.info("index page loads");
		return "index";
	}
	
	@GetMapping("/empform")
	public String employeePage(ModelMap map) {
//		logger.info("empform gets  loaded");
		log.info("empform gets  loaded");

		Employee employee = new Employee();
		employee.setId(0);
		employee.setName("");
		employee.setSalary(0.0f);
		map.addAttribute("employee", employee );
		return "empform";
	}
	
	@PostMapping("/empaction")
	public String employeePage(@ModelAttribute("employee")  @Valid Employee employee, BindingResult result ) {
		
		validator.validate(employee, result);
		
		if(result.hasErrors()) {
//			logger.error("empform has some error ");
			log.error("empform has some error ");
			return "empform";
		}
		else {
			return "empresult";
		}
	}
	
	
	
	
}
