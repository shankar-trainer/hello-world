package com.cts.web;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cts.model.Account;

@Component
public class AccountValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return Account.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "actId", "actId.required", "Account id is required");
		ValidationUtils.rejectIfEmpty(errors, "actName", "actName.required", "Account name is required");
		ValidationUtils.rejectIfEmpty(errors, "actBalance", "actBalance.required", "Account balance  is required");
		ValidationUtils.rejectIfEmpty(errors, "actCreationDate", "actCreationDate.required",
				"Account creation date is required");

//		ValidationUtils.rejectIfEmpty(errors, "dob", "dob.required",
//				"Account dob is required");
	}

}
