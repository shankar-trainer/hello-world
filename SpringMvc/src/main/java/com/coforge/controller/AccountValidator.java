package com.coforge.controller;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.coforge.model.Account;

@Component
public class AccountValidator  implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Account.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		Account account=(Account) target;
		
		if(account.getName().length()<=10)
		errors.rejectValue("name", "name.minlength","name length must of >10 chars");
		
		if(account.getBalance()<=0)
			errors.rejectValue("balance", "balance.valid","invalid balance");
		if(account.getEquityAllocation()<1000)
			errors.rejectValue("equityAllocation","equityAllocation.valid", "Equity Allocation must be >1000");

		
//		ValidationUtils.rejectIfEmpty(errors, "name", "name.required");
//		ValidationUtils.rejectIfEmpty(errors, "balance", "balance.required");
//		ValidationUtils.rejectIfEmpty(errors, "equityAllocation", "equityAllocation.required");
//		ValidationUtils.rejectIfEmpty(errors, "accountCreationDate", "accountcreationdate.required");
	}
}
