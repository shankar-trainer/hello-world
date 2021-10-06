package org.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")

public class LoginController {
@RequestMapping("/loginform")
public String loginForm()
{
	return "loginform";
	
}/*
@RequestMapping("/loginAction")
public String getResult(@RequestParam("id")int id,
		@RequestParam("name")String name,
		@RequestParam("salary")float salary, Model map)
		{
			Employee employee=new Employee();
			
			employee.setId(101);
			employee.setName("abc");
			employee.setSalary(10000);
			map.addAttribute("emp",employee);
			return "empResult";
		}*/


@RequestMapping("/loginAction")
public ModelAndView getResult(@RequestParam("id")int id,
		@RequestParam("name")String name,
		@RequestParam("salary")float salary, Model map)
		{
			Employee employee=new Employee();
			
			employee.setId(101);
			employee.setName("abc");
			employee.setSalary(10000);
			map.addAttribute("emp",employee);
			map.addAttribute("city","delhi");
			
			ModelAndView modelAndview=new ModelAndView("empResult", "employee",map);
			
			return modelAndview;
		}
	
	
}
