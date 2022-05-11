package com.cognizant.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.model.Customer;

@Controller
@RequestMapping("/cust")
public class CustomerController {
	
	@RequestMapping("/custform")
	public String customerForm(Model model) {
		Customer customer=new Customer();
		model.addAttribute("customer", customer);
		return "CustomerForm";
	}
	
	@RequestMapping("/customerAction")
	public String CustomerValidate(@ModelAttribute
			("customer") @Valid Customer customer,BindingResult result) {
		if(result.hasErrors())
			return "CustomerForm";
		else
			return "CustomerResult";
	} 
	
}
