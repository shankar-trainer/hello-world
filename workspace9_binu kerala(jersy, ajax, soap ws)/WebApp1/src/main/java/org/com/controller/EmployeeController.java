package org.com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.com.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	// @RequestMapping("/login")
	// @RequestMapping(value="/login",method=RequestMethod.GET )

	@GetMapping("/login")
	public String empLogin() {
		System.out.println("empLogin called ");
		return "login";
	}

	@PostMapping("/login")
	// @RequestMapping(value="/login",method=RequestMethod.POST)
	public String empresult(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("salary") float salary, HttpServletRequest req) {

		Employee emp1 = new Employee();

		emp1.setId(id);
		emp1.setSalary(salary);
		emp1.setName(name);
		req.setAttribute("emp1", emp1);

		return "loginResult";
	}

	@GetMapping("/login1")
	// @PostMapping("/login1")
	// @RequestMapping(value="/login",method=RequestMethod.POST)
	public String empresult1(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("salary") float salary, Model model, ModelMap map1) {

		Employee emp1 = new Employee();

		emp1.setId(id);
		emp1.setSalary(salary);
		emp1.setName(name);

		map1.addAttribute("emp1", emp1);
		map1.addAttribute(emp1);
		map1.addAttribute("state", "new delhi");
		map1.addAttribute("country ", "india");

		// req.setAttribute("emp1", emp1);

		return "loginResult";
	}

	@GetMapping("/login2")
	// @PostMapping("/login1")
	// @RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView empresult2(@RequestParam("id") Integer id, @RequestParam("name") String name,
			@RequestParam("salary") Float salary, Model model, ModelMap map1, @RequestParam("city") String city) {

		Employee emp1 = new Employee();

		ModelAndView modelAndView = null;

		{
			
			emp1.setId(id);
			emp1.setSalary(salary);
			emp1.setName(name);

			
			map1.addAttribute("emp1", emp1);
			map1.addAttribute(emp1);
			map1.addAttribute("state", "new delhi");
			map1.addAttribute("country ", "india");
			map1.addAttribute("city", "kolkotta");

			// req.setAttribute("emp1", emp1);

			// ModelAndView modelAndView=new ModelAndView("loginResult");
			modelAndView = new ModelAndView("loginResult", map1);
		}

		return modelAndView;
	}

	

}
