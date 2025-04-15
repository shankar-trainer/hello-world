package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.exception.EmployeeException;
import com.example.model.Employee;

@Controller
@RequestMapping("/")
public class EmployeeController {

//	@RequestMapping("/employee")
	@GetMapping("/employee")
	public String welcome() {
		return "EmployeeForm";
	}

//	@GetMapping("/employeeAction")
//	@PostMapping("/employeeAction")
//	public String employeeResult(@RequestParam("empId") int id, @RequestParam("empName") String name,
//			@RequestParam("empsalary") float salary, ModelMap map) {
//			
//		Employee employee = new Employee();
//		
//		employee.setEmpId(id);
//		employee.setEmpName(name);
//		employee.setEmpsalary(salary);
//		
//		map.addAttribute("employee", employee);
//		
//		return "EmployeeResult";
//	}
	@PostMapping("/employeeAction")
	public ModelAndView employeeResult(@RequestParam("empId") int id, @RequestParam("empName") String name,
			@RequestParam("empsalary") float salary, ModelMap map) {

		Employee employee = new Employee();
		if (employee.getEmpId() <= 0)
			throw new EmployeeException("invalid id ");
		else if (employee.getEmpName().isEmpty())
			throw new EmployeeException("invalid name");
		else {

			employee.setEmpId(id);
			employee.setEmpName(name);
			employee.setEmpsalary(salary);

			map.addAttribute("employee", employee);
			ModelAndView andView = new ModelAndView("EmployeeResult", map);

			return andView;
		}
	}
//
//	@ExceptionHandler(value = Exception.class)
//	public String exception1() {
//		return "error";
//	}
//	@ExceptionHandler(value = EmployeeException.class)
//	public String exception2() {
//		return "error1";
//	}

}
