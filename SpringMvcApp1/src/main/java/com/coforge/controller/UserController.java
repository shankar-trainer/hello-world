package com.coforge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coforge.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/hello")
	public String hello() {
		return "UserForm";// return String is view
	}
	
	@RequestMapping("/UserAction")
	public String action1(@RequestParam("id") int id,
			@RequestParam("name") String name,
			@RequestParam("salary") float salary,
			ModelMap map
			) {
		User user=new User();
		user.setId(id);
		user.setName(name);
		user.setSalary(salary);
		map.put("user", user);
		return "UserResult";
	}
	
}
