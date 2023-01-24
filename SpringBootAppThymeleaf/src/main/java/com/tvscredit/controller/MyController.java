package com.tvscredit.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tvscredit.model.User;

@Controller
@RequestMapping("/")
public class MyController {

	@RequestMapping("/")
	public String hello(Model model) {
		User user=new User();
		model.addAttribute("user", user);
		return "index";
	}

	@PostMapping("/userAction")
//	public String userAction(@ModelAttribute("user") User user) {
		public String userAction(@Valid @ModelAttribute("user") User user,BindingResult bindingResult) {
       if(bindingResult.hasErrors())
    	   return "index.html";
		return "userResult";
	}
}
