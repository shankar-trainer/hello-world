package com.coforge.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerValidator validator;
	public CustomerController(CustomerValidator customerValidator) {
	  this.validator=customerValidator;
	}
	
	@InitBinder
	public void InitBinder(WebDataBinder binder){
		binder.setValidator(validator);
	}
	
	@RequestMapping("/form")
	public ModelAndView welcome(ModelMap map) {
		Customer customer=new Customer();
		customer.setCustomerId(0);
		customer.setCustomerName("");
		customer.setCustomerSalary(0.0f);
		
		map.addAttribute("customer", customer);
		return  new ModelAndView("CustomerForm");
	}
	// spring validation
	@PostMapping("/customerAction")
	public ModelAndView customerProcess(@ModelAttribute("customer") @Valid Customer customer,BindingResult result) {
		if(result.hasErrors()) {
			return new ModelAndView("CustomerForm");
		}
		else {
			return new ModelAndView("result/CustomerResult");
		}
		
	}
	
}