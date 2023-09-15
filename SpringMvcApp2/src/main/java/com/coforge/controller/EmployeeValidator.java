package com.coforge.controller;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.coforge.model.Employee;

@Component
public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Employee.class.isAssignableFrom(clazz);
		// return Employee.class.equals(clazz);
	}
/*
	@Override
	public void validate(Object target, Errors errors) {
		//ValidationUtils.rejectIfEmpty(errors, "name", "name.required");

		Employee employee = (Employee) target;
		if (employee.getId() <= 0)
			errors.rejectValue("id", "id.required", "id is zero or negative");
		// errors.rejectValue("id","id.required");
		if (employee.getPassword().isBlank())
			errors.rejectValue("password", "pass.required", "password is of zero length");
		if (employee.getName().isBlank())
			errors.rejectValue("name", "name.required", "name is of zero length");
		if (employee.getSalary() <= 0)
			errors.rejectValue("salary", "salary.required", "salary is zero or negative");
	//if (employee.getGender().length==0)
		//	errors.rejectValue("gender", "gender.required", "select gender");
		//if (employee.getHobbies().length == 0)
			//errors.rejectValue("hobbies", "hobbies.required", "select hobbies");
	}
*/
	@Override
	public void validate(Object target, Errors errors) {
  		ValidationUtils.rejectIfEmpty(errors, "id", "id.required", "id is zero or negative");
		//ValidationUtils.rejectIfEmpty(errors, "id", "id.required");
		ValidationUtils.rejectIfEmpty(errors, "password", "pass.required", "password is of zero length");
		ValidationUtils.rejectIfEmpty(errors, "name", "name.required", "name is of zero length");
		ValidationUtils.rejectIfEmpty(errors, "salary", "salary.required", "salary is zero or negative");
		ValidationUtils.rejectIfEmpty(errors, "gender", "gender.required", "select gender");
		ValidationUtils.rejectIfEmpty(errors, "hobbies", "hobbies.required", "select hobbies");
	}
}
