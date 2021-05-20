package com.cts.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties.View;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.model.Customer;
import com.cts.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	
	//@RequestMapping(value = "/empform",method = RequestMethod.GET)
	@GetMapping("/empform")
	public String employeeForm() {
		return "EmployeeForm";
	}
	
//	@RequestMapping(value = "/empform",method = RequestMethod.POST)
	@PostMapping("/empform")
	public String employeeForm1(
			@RequestParam("empId") int empId,
			@RequestParam("empName") String empName,
			@RequestParam("empLocation") String empLocation,
			ModelMap map) 	{		
		Employee employee=new Employee();
		employee.setEmpId(empId);
		employee.setEmpName(empName);
		employee.setEmpLocation(empLocation);
		
		map.addAttribute("employee",employee);
		return "employeeResult";
	}
	
	//@RequestMapping(value = "/empform1",method = RequestMethod.POST)
	@PostMapping("/empform1")
	public ModelAndView employeeForm2(
			@RequestParam("empId") int empId,
			@RequestParam("empName") String empName,
			@RequestParam("empLocation") String empLocation
			) {
		
		Employee employee=new Employee();
		employee.setEmpId(empId);
		employee.setEmpName(empName);
		employee.setEmpLocation(empLocation);
		
		
		ModelAndView modelAndView=new ModelAndView("employeeResult", "employee", employee);
		return modelAndView;
	}
	
	

}
