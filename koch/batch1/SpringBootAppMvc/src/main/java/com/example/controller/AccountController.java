package com.example.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.exception.AccountException;
import com.example.model.Account;
import com.example.service.AccountService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/")
public class AccountController {
	
	@ExceptionHandler(exception = AccountException.class)
	public String accountError() {
		return "accounterror";
	}

	@GetMapping("/accountForm")
	public String accountForm(ModelMap map) {
		map.addAttribute("account", new Account());
		return "accountform";
	}

	@ModelAttribute("accountType")
	public List<String> accountType() {
		List<String> list1 = new ArrayList<String>();
		list1.add("saving");
		list1.add("current");
		list1.add("demate");
		return list1;
	}

	@ModelAttribute("gender")
	public List<String> getGender() {
		return Arrays.asList(new String[] { "male", "female" });
	}
	
	@ModelAttribute("cityList")
	public List<String> getCityList() {
		return Arrays.asList(new String[] { "chennai", "madurai","kanchipuram","banglore","hyderabad" });
	}
	
	@Autowired
	AccountService  service;
	
	
	@PostMapping("/accountAction")
	public String accountPost(@ModelAttribute("account") @Valid Account account, BindingResult result,
			@RequestParam("operation") String operation, ModelMap map
			) {
		Account account1;

		if (result.hasErrors())
			return "accountform";
		else {
			System.out.println("operation ..."+operation);
			switch (operation) {
			case "add": {
			        account1= service.addAccount(account);	
			        map.addAttribute("operation", operation);
			        map.addAttribute("account", account);
				break;
			}
			case "showall": {
				 List<Account> showAllAccount = service.showAllAccount();	
				map.addAttribute("operation", operation);
				map.addAttribute("showAllAccount", showAllAccount);
				break;
			}
			
			case "search": {
				account1=null;
				account1= service.searchAccount(account.getAccountId());	
				map.addAttribute("operation", operation);
				map.addAttribute("account",account);
				break;
			}
			case "delete": {
				account1=null;
				account1= service.deleteAccount(account.getAccountId());	
				map.addAttribute("operation", operation);
				map.addAttribute("account",account);
				break;
			}
			case "update": {
				account1=null;
				account1= service.updateAccount(account);	
				map.addAttribute("operation", operation);
				map.addAttribute("account",account);
				break;
			}
			
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + "add");
			}
			
			return "accountsuccess";
		}

	}

}
