package com.cts.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.model.User;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/form")
	public String userForm(Model model) {
		User user=new User();
		model.addAttribute("user", user);
		return "UserForm";
	}
	
	@RequestMapping("/login")
	public String login(@ModelAttribute("user") @Valid User user, BindingResult result)
	{
		
		if(result.hasErrors())
			return "UserForm";
		
		return "UserResult";
		
	}
	
	@ModelAttribute("hobbyList")
	public List<String> getHobbies(){
		
		List<String> list1=new ArrayList<String>();
	    list1.add("movie");
	    list1.add("web series");
	    list1.add("music");
	    list1.add("touring");
	    list1.add("painting");
	    return list1;
	}
	
	@ModelAttribute("cityList")
	public List<String> getCities(){
		
	return 	Arrays.asList(new String[] {
			"chennai","madurai","coimbtore","hyderabad","amrabati","nellore"	
		});
	}
	
	@ModelAttribute("gender")
	public List<String> getGender(){
		
		return 	Arrays.asList(new String[] {
				"male","female"	
		});
	}
	
}
