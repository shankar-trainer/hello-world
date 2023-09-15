package com.coforge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coforge.exception.UserException;
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
			) throws UserException {
		User user=new User();
		if(id<=0)
			throw new UserException("id is zero or -ve");
		
		else 	if(name.isBlank())
			throw new UserException("name is blank");
		
		else if(salary<=0)
			throw new UserException("salary is zero or -ve");
		else {
		user.setId(id);
		user.setName(name);
		user.setSalary(salary);
		map.put("user", user);
		return "UserResult";
		}
	}
	
	@ExceptionHandler(value = UserException.class)
	public String userError() {
		return "error1";
	}
}
