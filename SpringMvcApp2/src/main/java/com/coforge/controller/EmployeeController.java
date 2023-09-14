package com.coforge.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
  
//	public String employeeInit(ModelMap map) {
		public ModelAndView employeeInit(ModelMap map) {
		Employee employee=new Employee();
		map.put("employee", employee);
		//return "emp/EmployeeForm";
		ModelAndView view=new ModelAndView("emp/EmployeeForm", map);
		return view;
	}
		
		@ModelAttribute("gender")
		public List<String> genderList(){
		 return	Arrays.asList(new String[] {"male","female"});
		}
		@ModelAttribute("hobbies")
		public List<String> hobbiesList(){
			return	Arrays.asList(new String[] {"flowering","music","movie","reading","dancing"});
		}
	
}
