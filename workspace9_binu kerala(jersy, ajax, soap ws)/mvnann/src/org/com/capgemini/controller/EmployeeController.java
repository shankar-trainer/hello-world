package org.com.capgemini.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/emp")
public class EmployeeController {

	@RequestMapping(value = "/loginform", method = RequestMethod.GET)
	public String empLogin(ModelMap map) {
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("name kumar");
		emp.setSalary(6565.0f);
		map.addAttribute("emp", emp);

		return "EmployeeForm";
	}

	List<String> emphobbylist;
	public List<String> empHobby(){
		emphobbylist  =new ArrayList<String>();
		emphobbylist.add("swimmmin");
		emphobbylist.add("reading");
		emphobbylist.add("youring");
		emphobbylist.add("yoga");
		return emphobbylist;
	}
	
	
	@RequestMapping(value = "/loginform", method = RequestMethod.POST)
	public String empAction(@ModelAttribute("emp") @Valid Employee emp, BindingResult result) {
		if (result.hasErrors())
			return "EmployeeForm";
		else
			return "EmployeeResult";
	}
}
