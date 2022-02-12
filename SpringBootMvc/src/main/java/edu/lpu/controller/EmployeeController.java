package edu.lpu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.lpu.model.Employee;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@RequestMapping("/form")
	public String hello() {
		return "empform";
	}

	@RequestMapping("/EmpAction")
	public String empaction(HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("id"));
		String nm = req.getParameter("name");
		float salary = Float.parseFloat(req.getParameter("salary"));
		Employee emp1 = new Employee();
		emp1.setId(id);
		emp1.setName(nm);
		emp1.setSalary(salary);
		req.setAttribute("emp1", emp1);
		return "empresult";
	}

}
