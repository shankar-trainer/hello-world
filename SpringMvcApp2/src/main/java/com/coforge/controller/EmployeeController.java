package com.coforge.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

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
import org.springframework.web.servlet.ModelAndView;

import com.coforge.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeValidator validator;

	public EmployeeController(EmployeeValidator employeeValidator) {
		this.validator = employeeValidator;
	}

	@InitBinder//("validator")
	public void InitBinder(WebDataBinder binder) {
		binder.setValidator(validator);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("dd-MM-yyyy"), true));

	}
	// @RequestMapping("/form")
	@GetMapping("/form")
//	public String employeeInit(ModelMap map) {
	public ModelAndView employeeInit(ModelMap map) {
		Employee employee = new Employee();
		employee.setId(0);
		employee.setPassword("");
		employee.setSalary(0.0f);
		employee.setName(" ");
		employee.setHobbies(new String[] {" "," "});
		employee.setGender(new String[] {" "," "});
		
		map.put("employee", employee);
		// return "emp/EmployeeForm";
		ModelAndView view = new ModelAndView("emp/EmployeeForm", map);
		return view;
	}

	@PostMapping("/employeeAction")
	public String employeeFormProcessed(@ModelAttribute("employee") @Valid   Employee employee,BindingResult result) {
	System.out.println("employee action called ..");
		if(result.hasErrors()) {
			System.out.println("error in employee...");
			return "emp/EmployeeForm";
		}
		else 
			return  "emp/EmployeeResult";
	}
	
	@ModelAttribute("gender")
	public List<String> genderList() {
		return Arrays.asList(new String[] { "male", "female" });
	}

	@ModelAttribute("hobbies")
	public List<String> hobbiesList() {
		return Arrays.asList(new String[] { "flowering", "music", "movie", "reading", "dancing" });
	}

}
