package com.cognizant.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.model.Account;

@Controller
@RequestMapping("/")
public class AccountController {

	@RequestMapping("/actForm")
	public String accountFormPage() {
		return "AccountPage";
	}
	
	@InitBinder
	public void init(WebDataBinder binder) {
		
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format, true));
	}
	
	
	@RequestMapping("/actAction")
	
	public String accountResultPage(@RequestParam("actId") int id,@RequestParam("actName") String name,@RequestParam("actSalary") float salary,@RequestParam("actCreationDate") Date date ,ModelMap map) {
		Account account=new Account();
		account.setActId(id);
		account.setActName(name);
		account.setActSalary(salary);
		account.setActCreationDate(date);
		
		map.addAttribute("account", account);
		
		return "AccountResult";
	}
	
	
	
	
}


