package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Employee;

import jakarta.validation.Valid;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeValidator validator;

	/*
	 * @Autowired public EmployeeController(EmployeeValidator validator) { super();
	 * this.validator = validator; }
	 */

	@RequestMapping("/")
	public String welcome() {
		return "index";
	}

	@RequestMapping("/jstl")
	public String jstlapp1(ModelMap map) {
		Employee employee[]=new Employee[] {
				new Employee(788777, "amit kumar", 90000.0f),
				new Employee(788771, "rajesh kumar", 98000.0f),
				new Employee(788772, "kamal kumar", 70000.0f),
				new Employee(788773, "vimal kumar", 45000.0f),
				new Employee(788776, "suresh kumar", 56000.0f)
		};
		map.addAttribute("emp", employee);
		
		return "jstl_page";
	}

	@RequestMapping("/empform")
	public String getEmpForm(ModelMap map) {

		Employee employee2 = new Employee();
		// employee2.setId(0);
		employee2.setName("");
		employee2.setSalary(0.0f);
		map.addAttribute("employee", employee2);

		return "empform";
	}

	@RequestMapping("/empaction")
	public String getEmpAction(@ModelAttribute("employee") @Valid Employee employee, BindingResult result) {
		validator.validate(employee, result);
		if (result.hasErrors()) {
			return "empform";
		} else
			return "empresult";
	}

}
