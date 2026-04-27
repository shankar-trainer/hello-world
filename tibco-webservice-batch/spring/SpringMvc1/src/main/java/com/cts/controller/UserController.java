package com.cts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/hello")
	public String welcome() {
		return "UserForm";
	}

	@RequestMapping("/userAction")
	public String userProcess(@RequestParam("userId") int id, @RequestParam("userName") String name,
			@RequestParam("userSalary") float salary, ModelMap map) {

		User user=new User();
		user.setUserId(id);
		user.setUserName(name);
		user.setUserSalary(salary);
		
		map.addAttribute("user", user);
		
		return "UserResult";

	}
}

//http://localhost:8080/SpringMvc1/user/hello