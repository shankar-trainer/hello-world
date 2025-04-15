package com.example.model;

import javax.security.auth.login.AccountException;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


@Component
public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Employee.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		/*
		 * ValidationUtils.rejectIfEmpty(errors, "id", "id.required","id is empty");
		 * ValidationUtils.rejectIfEmpty(errors, "name", "name.required",
		 * "name is empty"); ValidationUtils.rejectIfEmpty(errors,
		 * "salary","salary.required", "salary is empty");
		 */

		ValidationUtils.rejectIfEmpty(errors, "id", "id.required");
		ValidationUtils.rejectIfEmpty(errors, "name", "name.required");
		ValidationUtils.rejectIfEmpty(errors, "salary","salary.required");
		
		
		
	}

}
