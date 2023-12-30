package com.coforge.controller;

import javax.validation.Validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.coforge.model.Customer;
@Component
public class CustomerValidator implements org.springframework.validation.Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Customer.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "customerName","customer.required", "customer name is required");
		
		Customer customer=(Customer) target;
		if(customer.getCustomerId()<=0)
			errors.rejectValue("customerId", "id.required","id is required");
		
		else if(customer.getCustomerId()<10000 || customer.getCustomerId()>50000)
			errors.rejectValue("customerId", "id.range","id should between 10000 - 50000");
		
		else if(customer.getCustomerSalary()<=0)
			errors.rejectValue("customerSalary","salary.required", "salary is required");
		
		else if(customer.getCustomerSalary()<50000 || customer.getCustomerSalary()>500000)
			errors.rejectValue("customerSalary","salary.range", "salary should between 50000 - 500000");
		
	}

}
