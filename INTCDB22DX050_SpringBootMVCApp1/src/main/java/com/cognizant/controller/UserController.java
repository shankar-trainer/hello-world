package com.cognizant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cognizant.model.User;

@Controller

@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {

	@RequestMapping("/index")
	public String userForm() {
		return "UserForm";
	}
	
	@RequestMapping("/userAction")
	public String UserAction(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("salary") float salary,ModelMap map) {
		
		User user=new User();
		user.setId(id);
		user.setName(name);
		user.setSalary(salary);
		
		map.addAttribute("user", user);
		return "UserResult";
	}
}
