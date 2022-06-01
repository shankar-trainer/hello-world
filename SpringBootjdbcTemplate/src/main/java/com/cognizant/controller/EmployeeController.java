package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

import com.cognizant.dao.EmployeeDaoImpl;
import com.cognizant.model.Employee;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeDaoImpl dao;

	@RequestMapping("/empForm")
	public String EmployeeForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "EmployeeForm";
	}

	@RequestMapping("/EmployeeAction")
	public String EmployeeFormProcess(@ModelAttribute("employee") @Valid Employee employee, BindingResult result,
			@RequestParam("submit") String submit, ModelMap map) {
		if (result.hasErrors())
			return "EmployeeForm";
		else {
			switch (submit) {
			case "Add Employee":
				if (dao.addEmployee(employee))
					map.put("result", "Record Added");

				if (!dao.addEmployee(employee))
					map.put("result", "Record Already Present");

				break;

			default:
				break;
			}
			return "EmployeeResult";
		}
	}

}
