package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.exception.CustomerException;
import com.example.model.Customer;

@Controller
@RequestMapping("/cst")
public class CustomerController {

	@GetMapping("/cstform")
	public String customerForm() {
		return "CustomerForm";
	}

	@PostMapping("/cstform")
	public String customerResult(@RequestParam("id") long id, @RequestParam("name") String name,
			@RequestParam("salary") float salary, ModelMap map) throws CustomerException {

		if (id <= 0) {
			throw new CustomerException("invalid id <br>id is empty or zero or -ve");
		}

		else if (name.isEmpty()) {
			throw new CustomerException("invalid name <br>name is empty or zero or -ve");
		}

		else if (salary <= 0) {
			throw new CustomerException("invalid salary  <br>salary is empty or zero or -ve");
		} else {
			Customer customer = new Customer();
			customer.setCustomerId(id);
			customer.setCustomerName(name);
			customer.setCustomerSalary(salary);
			map.addAttribute("customer", customer);
			return "CustomerResult";
		}
	}
//	@ExceptionHandler(value = CustomerException.class)
//	public String myexception() {
//		return "CustomerError";
//	}
//	
//	@ExceptionHandler(value = Exception.class)
//	public String myexception1() {
//		return "CustomerError";
//	}

}
