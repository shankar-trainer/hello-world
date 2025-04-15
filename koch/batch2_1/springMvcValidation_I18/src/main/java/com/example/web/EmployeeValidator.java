package com.example.web;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.example.model.Employee;

@Component
public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Employee.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		/*
		 * ValidationUtils.rejectIfEmpty(errors, "Id", "id.error", "id is empty");
		 * ValidationUtils.rejectIfEmpty(errors, "name", "name.error", "name is empty");
		 * ValidationUtils.rejectIfEmpty(errors, "salary", "salary.error",
		 * "salary is empty");
		 */
	
		ValidationUtils.rejectIfEmpty(errors, "Id", "id.error" );
		ValidationUtils.rejectIfEmpty(errors, "name", "name.error");
		ValidationUtils.rejectIfEmpty(errors, "salary", "salary.error");
		
		Employee employee=(Employee) target;
		
		if(employee==null) {
			System.out.println("employee is null");
		}
		
		else {
			
		if(employee.getId()<=0 )
			 errors.rejectValue("Id", "id.error1");
		
		else if(employee.getId()<10000 || employee.getId()>20000)
			errors.rejectValue("Id", "id.range");
	 }
	}

	

}
