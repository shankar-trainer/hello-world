package com.example.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Customer;

@Controller
@RequestMapping
public class CustomerController {

	//@RequestMapping("/cstLogin")
	
	@RequestMapping(value = "/cstLogin", method = RequestMethod.GET)
	public String customerLogin(ModelMap map) {
		
		Customer customer=new Customer();
		customer.setId(1230);
		customer.setName("ram kumar");
		customer.setSalary(34000.0f);
		customer.setSsn("custr4576767");
		customer.setEmail("ramkumar@gmail.com");
		map.addAttribute("customer", customer);
		return "CustomerLoginForm";
	}
	
	
	@RequestMapping(value = "/cstLogin",method = RequestMethod.POST)
	public String customerValidate
	(@ModelAttribute("customer") @Valid Customer customer,BindingResult result) {
	
		if(result.hasErrors())
			return "CustomerLoginForm";
		else
			return "CustomerInfo";
	}
	
	
	
	
}
