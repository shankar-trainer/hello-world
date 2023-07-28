package com.abc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abc.exception.EmployeeException;
import com.abc.model.Employee;
import com.abc.service.EmployeeService;

@Controller
@RequestMapping("/")
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@GetMapping("/form")
	public String employeeForm() {
		return "EmployeeForm";
	}
//
//	@ExceptionHandler(value = EmployeeException.class)
//	public String handleError() {
//		return "error1";
//	}
//	
//	@ExceptionHandler(value =Exception.class)
//	public String handleError1() {
//		return "error1";
//	}

	@GetMapping("/empAction")
	public String empFormProcess(ModelMap map, @RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("salary") float salary) throws EmployeeException {
		if (id <= 0)
			throw new EmployeeException("id is <=0");

		else if (id < 10000 || id > 50000)
			throw new EmployeeException("id not in range of 10000 - 50000");

		else if (name.isBlank())
			throw new EmployeeException("name is blank");

		else if (name.length() < 5)
			throw new EmployeeException("name must of at least 5 character");

		else if (salary <= 0)
			throw new EmployeeException("salary cannot be zero or in minus ");

		else if (salary < 10000 || salary > 200000)
			throw new EmployeeException("min salary must be 10000 and max salary must not be greater than 200000  ");
		else {
			Employee employee = new Employee();
			employee.setId(id);
			employee.setName(name);
			employee.setSalary(salary);
			map.addAttribute("employee", employee);
			

			service.addEmployee(employee);
			map.addAttribute("list", service.getAllEmployee());
			
			
			return "EmployeeResult";
		}
	}

	public String welcome() {
		return "index";
	}

}
