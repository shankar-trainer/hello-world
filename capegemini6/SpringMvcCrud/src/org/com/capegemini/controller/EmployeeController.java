package org.com.capegemini.controller;

import javax.validation.Valid;

import org.com.dao.JpaStudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@RequestMapping(value = "/addform", method = RequestMethod.GET)
	public String empLogin(ModelMap map) {
		Employee employee = new Employee();
		employee.setId(1001);
		employee.setName("aman  kumar");
		employee.setSalary(20000.00f);

		map.addAttribute("emp", employee);
		return "empform";
	}

	@Autowired
	JpaStudentDao dao;

	@RequestMapping(value = "/loginform", method = RequestMethod.POST)
	public String empAction(@ModelAttribute("emp") @Valid Employee emp, BindingResult result, ModelMap map) {
		if (result.hasErrors())
			return "EmployeeForm";
		else {
			if (dao.store(emp))
				map.addAttribute("msg", "Record added");
			else
				map.addAttribute("msg", "Record already present");

			return "EmployeeResult";
		}
	}

}
