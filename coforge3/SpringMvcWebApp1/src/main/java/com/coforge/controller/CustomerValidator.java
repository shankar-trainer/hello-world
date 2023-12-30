package com.coforge.controller;

import javax.validation.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.coforge.model.Customer;

public class CustomerValidator implements org.springframework.validation.Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Customer.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "customerName", "customer name is required");
		
		Customer customer=(Customer) target;
		if(customer.getCustomerId()<=0)
			errors.rejectValue("customerId", "id is required");
		if(customer.getCustomerSalary()<=0)
			errors.rejectValue("customerSalary", "salary is required");
		
	}

}
