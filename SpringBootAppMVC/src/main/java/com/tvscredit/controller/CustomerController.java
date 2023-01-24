package com.tvscredit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tvscredit.exception.CustomerException;
import com.tvscredit.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// @RequestMapping("/mypage")
	@GetMapping("/mypage")
	public String hello() {
		return "CustomerForm";
	}
/*	
	@ExceptionHandler(value = CustomerException.class)
	public String error(CustomerException e) {
		return "CustomerError";
	}
	*/

	@PostMapping("/customeraAction")
	public String customerOperation(@RequestParam("customerId") int id, @RequestParam("customerName") String name,
			@RequestParam("customerAge") int age, @RequestParam("customerSalary") float salary, ModelMap map)
			throws CustomerException {
		if (id <= 0) 
			throw new CustomerException("invalid id");
		
		else if (name.isEmpty()|| name=="" 
				||name==null				) 
			throw new CustomerException(" name is blank");
		
		else if (salary <= 0) 
			throw new CustomerException("invalid salary");
		
		else if (age <= 0) 
			throw new CustomerException("invalid age");
		
		if (id <= 0) 
			throw new CustomerException("invalid id");
		

		else {
			Customer customer = new Customer();
			customer.setCustomerAge(age);
			customer.setCustomerName(name);
			customer.setCustomerSalary(salary);
			customer.setCustomerId(id);
			map.addAttribute("customer", customer);
		}
		return "CustomerResult";
	}
}
///SpringBoootAppMVC/src/main/webapp/WEB-INF/jsp/hello.jsp