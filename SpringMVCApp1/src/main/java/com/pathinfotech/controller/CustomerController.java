package com.pathinfotech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pathinfotech.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping("/customerForm")
	public String customerPage() {
		return "CustomerForm";
	}
	
	@RequestMapping("/customerAction")
	public String customerOperation(@RequestParam("CustomerId") int id, @RequestParam("CustomerName") String name,
			@RequestParam("CustomerSalary") float salary
			,ModelMap map
			) {
		Customer customer=new Customer();
		customer.setCustomerId(id);
		customer.setCustomerName(name);
		customer.setCustomerSalary(salary);
		
		map.addAttribute("customer", customer);
		return "CustomerResult";
	}
	
	
}
