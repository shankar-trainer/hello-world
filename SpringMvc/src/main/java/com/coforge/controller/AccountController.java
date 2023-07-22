package com.coforge.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coforge.model.Account;

@Controller
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	AccountValidator accountValidator;
	
	public AccountController(AccountValidator accountValidator) {
		super();
		this.accountValidator = accountValidator;
	}
	
	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		binder.setValidator(accountValidator);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("dd-MM-yyyy"), true));
	}


	@RequestMapping("/actform")
	public String form(ModelMap map) {
		Account account=new Account();
		
		account.setName("suresh kumar");
		account.setBalance(200000.0F);
		account.setEquityAllocation(100000.0f);
		account.setAccountCreationDate(new Date(2023-1900, 10, 20));
	
		map.addAttribute("account", account);
		return "accountpage/AccountForm";
	}
	
	@PostMapping("/actform")
	public String accountexecute(@ModelAttribute("account") @Valid Account account, 
			BindingResult result) {
	  if(result.hasErrors()) {
		  System.out.println("there is error");
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
