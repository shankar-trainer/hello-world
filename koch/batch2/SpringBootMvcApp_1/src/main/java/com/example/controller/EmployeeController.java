package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.ModelAndView;

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
		if(id<=0)
			throw new RuntimeException("invalid id ");
		else if(name.isEmpty())
			throw new RuntimeException("invalid name");
		else if(salary<=0)
			throw new RuntimeException("invalid salary");
		else {
		
		employee.setEmpId(id);
		employee.setEmpName(name);
		employee.setEmpsalary(salary);
		
		map.addAttribute("employee", employee);
		ModelAndView andView=new ModelAndView("EmployeeResult", map);
		
		return andView;
		}
	}
	
	@ExceptionHandler(exception = NumberFormatException.class)
	public String myexception() {
		return "error";
	}
	@ExceptionHandler(exception = MethodArgumentTypeMismatchException.class)
	public String myexception2() {
		return "error";
	}
	@ExceptionHandler(exception = Exception.class)
	public String myexception1() {
		return "error";
	}
	
	
//	@PostMapping("/employeeAction")
//	public ModelAndView employeeResult(@RequestParam("empId") int id, @RequestParam("empName") String name,
//			@RequestParam("empsalary") float salary, ModelMap map) {
//		
//		Employee employee = new Employee();
//		
//		employee.setEmpId(id);
//		employee.setEmpName(name);
//		employee.setEmpsalary(salary);
//		
//		map.addAttribute("employee", employee);
//		ModelAndView andView=new ModelAndView("EmployeeResult", map);
//		
//		return andView;
//	}

}
