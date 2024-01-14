package com.coforge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.coforge.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/hello")
	public String welcome() {
		return "UserForm";
	}

	//@PostMapping("/hello") equal  @RequestMapping(path = "/hello", method = RequestMethod.POST)  
	//@RequestMapping(path = "/hello", method = RequestMethod.POST)
	 @PostMapping("/hello")
	public String userForm(@RequestParam("id") int id, @RequestParam("name") String nm,
			@RequestParam("salary") float sal, ModelMap map) {

		 
		User user = new User();
		user.setId(id);
		user.setName(nm);
		user.setSalary(sal);

		map.addAttribute("user1", user);

		return "result/UserResult";
	}
}
//https://github.com/shankar-trainer/hello-world/tree/coforge23_2/coforge3/SpringMvcWebApp1