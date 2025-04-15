package org.example.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.example.error.AccountException;
import org.example.model.Account;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/account")

public class AccountController {

	@RequestMapping("/form")
	public String accountForm() {
		return "AccountForm";
	}

	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("dd/MM/yyyy") ,true ));
	}
/*	
	@ExceptionHandler(value =AccountException.class )
	public String error(AccountException e) {
		return "error";
	}	
	
	@ExceptionHandler(Exception.class)
	public String error1() {
		return "error1";
	}	
	*/
	
	@RequestMapping("/actAction")
	public 
	//ModelAndView 
	String
	accountResult(@RequestParam("id") int id,@RequestParam("name") String name, @RequestParam("salary") Float salary,@RequestParam("actCreation") Date actCreation ,ModelMap map) throws AccountException {
		Account account=new Account();
		if(id<=0)
			throw new AccountException("invalid account id");
		else if(name.isEmpty())
			throw new AccountException("invalid account name");
		else if(salary<=0)
			throw new AccountException("invalid account salary");
		else {		
		account.setId(id);
		account.setName(name);
		account.setSalary(salary);
		account.setActCreation(actCreation);
		map.addAttribute("account", account);
		return "AccountPage";
		//ModelAndView modelnview =new ModelAndView("AccountPage",map);
		//return modelnview;
		}
	}
}
