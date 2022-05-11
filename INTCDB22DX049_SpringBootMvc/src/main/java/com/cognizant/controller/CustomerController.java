package com.cognizant.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cognizant.model.Customer;

@Controller
@RequestMapping
@SessionAttributes("customer")
public class CustomerController {

	@RequestMapping("/form")
	public String customerForm() {
		return "CustomerForm";
	}
	
	@RequestMapping("/cAction")
	public String customerAction(ModelMap map,@RequestParam("custId") int id,@RequestParam("custName") String name,@RequestParam("custSalary") float salary 
		
			) {
		Customer customer=new Customer();
		customer.setCustId(id);
		customer.setCustName(name);
		customer.setCustSalary(salary);
	
		map.addAttribute("customer", customer);
		return "CustomerSuccess";
	}
	
@RequestMapping("/jstl")
public String jstlExample() {
	return "jstl_example1";
}	
	
	@RequestMapping("/empaction")
	public String empResult() {
		return "emp";
	}	
	
}
