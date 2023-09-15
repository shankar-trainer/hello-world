package com.coforge.controller;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.coforge.model.Employee;
@Component
public class EmployeeValidator implements  Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Employee.class.isAssignableFrom(clazz);
		   //return Employee.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("validate called....in employee");
		//ValidationUtils.rejectIfEmpty(errors, "name", "name.required");

		Employee employee=(Employee) target;
		if(employee.getId()<=0)
			errors.rejectValue("id","id.required", "id is zero or negative");
		else if(employee.getPassword().length()==0)
			errors.rejectValue("password", "pass.required","password is of zero length");
		else if(employee.getName().length()==0)
			errors.rejectValue("name", "name.required","name is of zero length");
		else if(employee.getSalary()<=0)
			errors.rejectValue("salary","salary.required", "salary is zero or negative");
		else if(employee.getGender().length==0)
			errors.rejectValue("gender", "gender.required","select gender");
		else if(employee.getHobbies().length==0)
			errors.rejectValue("hobbies", "hobbies.required","select hobbies");
	}

}
