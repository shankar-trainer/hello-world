package com.coforge.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coforge.model.Account;

@Controller
@RequestMapping("/account")
public class AccountController {
	

	@RequestMapping("/actform")
	public String form(ModelMap map) {
		Account account=new Account();
		map.addAttribute("account", account);
		return "accountpage/AccountForm";
	}
	
	@PostMapping("/actform")
	public String accountexecute(@ModelAttribute("account") @Valid Account account, 
			BindingResult result) {
	  if(result.hasErrors()) {
		  return "accountpage/AccountForm";
	  }
	  else 
		  return "accountpage/AccountResult";
	}
	
	@ModelAttribute("gender")
	public List<String> getGenderList(){
		 return Arrays.asList(new String[] {"male","female"});
	}
	
	@ModelAttribute("acttype")
	public List<String> getAccountList(){
		return Arrays.asList(new String[] {"saving","current","demate"});
	}
	
	
}
