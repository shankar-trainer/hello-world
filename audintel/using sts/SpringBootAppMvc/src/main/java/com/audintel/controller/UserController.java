package com.audintel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.audintel.model.User;

@Controller
@RequestMapping("/")
public class UserController {
	public String welcome() {
		return "index";
	}
	
	@RequestMapping("/uform")
	public String userForm() {
		return "userform";
	}
	
	@RequestMapping("/userAction")
	public String userProcess(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("salary") float salary, ModelMap map) {
		
		User user=new User();
		user.setId(id);
		user.setName(name);
		user.setSalary(salary);
		map.addAttribute("user", user);
		
		return "user_result";
	}

}
