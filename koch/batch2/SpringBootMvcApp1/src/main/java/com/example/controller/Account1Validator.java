package com.example.controller;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.example.model.Account1;

@Component
public class Account1Validator  implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Account1.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		ValidationUtils.rejectIfEmpty(errors, "name", "name.required");
		ValidationUtils.rejectIfEmpty(errors, "balance", "balance.required");
		ValidationUtils.rejectIfEmpty(errors, "equityAllocation", "equityAllocation.required");
		ValidationUtils.rejectIfEmpty(errors, "location", "location.required");
		ValidationUtils.rejectIfEmpty(errors, "accountCreationDate", "accountcreationdate.required");
		ValidationUtils.rejectIfEmpty(errors, "gender", "gender.required");
		ValidationUtils.rejectIfEmpty(errors, "accountType", "accountType.required");
	}
}
