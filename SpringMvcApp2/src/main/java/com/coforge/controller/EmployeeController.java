package com.coforge.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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

	@InitBinder("validator")
	public void InitBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}
	// @RequestMapping("/form")
	@GetMapping("/form")
//	public String employeeInit(ModelMap map) {
	public ModelAndView employeeInit(ModelMap map) {
		Employee employee = new Employee();
//		employee.setId(10001);
//		employee.setPassword("aa");
//		employee.setSalary(9999);
//		employee.setName("suresh kumar");
//		employee.setHobbies(new String[] {"hobby1","hobby2"});
//		employee.setGender(new String[] {"male","female"});
		
		map.put("employee", employee);
		// return "emp/EmployeeForm";
		ModelAndView view = new ModelAndView("emp/EmployeeForm", map);
		return view;
	}

	@PostMapping("employeeAction")
	public String employeeFormProcessed(@ModelAttribute("employee") @Valid   Employee employee,BindingResult result) {
	
		if(result.hasErrors()) {
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
