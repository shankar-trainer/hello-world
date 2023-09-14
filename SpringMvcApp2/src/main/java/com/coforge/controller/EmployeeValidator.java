package com.coforge.controller;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.coforge.model.Employee;
@Component
public class EmployeeValidator implements  Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		Employee.class.isAssignableFrom(clazz);
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		Employee employee=(Employee) target;
		if(employee.getId()<=0)
			errors.rejectValue("id", "id is zero or negative");
		else if(employee.getPassword().length()==0)
			errors.rejectValue("password", "password is of zero length");
		else if(employee.getName().length()==0)
			errors.rejectValue("name", "name is of zero length");
		else if(employee.getSalary()<=0)
			errors.rejectValue("salary", "salary is zero or negative");
		else if(employee.getGender().length==0)
			errors.rejectValue("gender", "select gender");
		else if(employee.getHobbies().length==0)
			errors.rejectValue("hobbies", "select hobbies");
	}

}
