package edu.lpu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.lpu.model.Employee;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@RequestMapping("/form")
	public String welcome() {
		return "emp_form";
	}
	
	@RequestMapping("/empaction")
	public String result(HttpServletRequest req) {
	    int id=Integer.parseInt(req.getParameter("id"));
	    String name=req.getParameter("name");
	   float sal=Float.parseFloat(req.getParameter("salary"));
		Employee employee=new Employee();
		employee.setId(id);
		employee.setName("ram kumar");
		employee.setSalary(sal);
		
		req.setAttribute("emp", employee);
		
	   return "emp_result";
	}
	
	
	
}
