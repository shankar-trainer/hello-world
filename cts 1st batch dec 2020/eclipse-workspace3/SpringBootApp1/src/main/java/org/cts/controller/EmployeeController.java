package org.cts.controller;

import org.cts.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	//@RequestMapping(path="/empform",method = RequestMethod.POST)

	@GetMapping("/empform")
	public String  empForm() {
		  return "employeeform";
	}
	

	/*@PostMapping("/empform")
	public String  getEmpData(@RequestParam("eid") int id, @RequestParam("ename") String name,
			@RequestParam("esalary") float salary,ModelMap map) {

		 Employee employee=new Employee();
		 
		 employee.setEid(id);
		 employee.setEname(name);
		 employee.setEsalary(salary);
		 
		 map.addAttribute("emp",employee);
		 		 
		 return "empResult";
	}
*/
	
	@PostMapping("/empform")
	public ModelAndView  getEmpData(@RequestParam("eid") int id, @RequestParam("ename") String name,
			@RequestParam("esalary") float salary) {

		 Employee employee=new Employee();
		 
		 employee.setEid(id);
		 employee.setEname(name);
		 employee.setEsalary(salary);
		 
		 ModelAndView modelAndView=new ModelAndView("empResult", "emp",employee);
		 		 
		 return   modelAndView;
	}
	
	
	
	
}
