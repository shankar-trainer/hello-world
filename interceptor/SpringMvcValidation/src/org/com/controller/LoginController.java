package org.com.controller;

import org.com.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping("/loginform")
	public String loginForm() {
		System.out.println("login called ");
		return "loginform";
	}

	/*
	 * @RequestMapping("/loginAction") public String getResult(@RequestParam("id")
	 * int id, @RequestParam("name") String name,
	 * 
	 * @RequestParam("salary") int salary, Model map) {
	 * 
	 * Employee employee=new Employee(); employee.setId(id); employee.setName(name);
	 * employee.setSalary(salary); map.addAttribute("emp", employee);
	 * 
	 * return "empResult";
	 * 
	 * }
	 */

	@RequestMapping("/loginAction")
	public ModelAndView getResult(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("salary") int salary, Model map) {
		System.out.println("controller called ");
		Employee employee = new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setSalary(salary);
		map.addAttribute("emp", employee);
		map.addAttribute("city", "delhi");

		ModelAndView modelAndView = new ModelAndView("empResult", "employee", map);
		return modelAndView;

	}

}
