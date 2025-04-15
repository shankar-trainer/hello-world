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
@RequestMapping("/")
public class EmployeeController {
//https://github.com/shankar-trainer/hello-world/tree/cts_april_22
//https://github.com/shankar-trainer/hello-world/tree/cts_april_22/SpringBootjdbcTemplate

	public String welcome() {
		return "index";
	}
	
	@Autowired
	private EmployeeDaoImpl dao;

	@RequestMapping("/empForm")
	public String EmployeeForm(Model model) {
		Employee employee = new Employee();
		employee.setId(null);
		employee.setName(null);
		employee.setSalary(null);

		model.addAttribute("employee", employee);
		return "EmployeeForm";
	}

	@RequestMapping("/EmployeeAction")
	public String EmployeeFormProcess(@ModelAttribute("employee") @Valid Employee employee, BindingResult result,
			@RequestParam("submit") String submit, ModelMap map) {
		map.put("submit", submit);
		switch (submit) {
		case "Add Employee":
			if (result.hasErrors())
				return "EmployeeForm";

			else if (dao.addEmployee(employee))
				map.put("result", "Record Added");
			else if (!dao.addEmployee(employee))
				map.put("result", "Record Already Present");

			break;

		case "ShowAll Employee":

			map.put("list", dao.showAllEmployee());

			break;
		case "Search Employee":
			Employee searchEmployee = dao.searchEmployee(employee.getId());
			map.put("employee", searchEmployee);
		default:
			break;
		}
		return "EmployeeResult";
	}
}
