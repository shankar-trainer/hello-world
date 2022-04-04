package com.capgemini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/form")
	public String gotoUserForm() {
		System.out.println("going to  form");
		return "UserForm";
	}
	
	@RequestMapping("/userForm")
	public String userFormResult(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("salary") float  salary,ModelMap map) {
	 	User user=new User();
	 	user.setId(id);
	 	user.setName(name);
	 	user.setSalary(salary);
	 	
	 	map.put("user", user);
	 	return "result";
	}
}
