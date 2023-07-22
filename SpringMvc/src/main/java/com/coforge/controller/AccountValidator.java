package com.coforge.controller;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.coforge.model.Account;

@Component
public class AccountValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Account.class.isAssignableFrom(clazz);
	}

//	@Override
//	public void validate(Object target, Errors errors) {
//
//		Account account = (Account) target;
//
//		if (account.getName().length() == 0)
//			errors.rejectValue("name", "name.minlength", "name is blank");
//		
//		else if (account.getName().length() <= 10)
//			errors.rejectValue("name", "name.minlength", "name length must of >10 chars");
//
//		else if (account.getBalance()==null)
//			errors.rejectValue("balance", "balance.valid", "balance is blank");
//		
//		else if (account.getBalance() <= 0)
//			errors.rejectValue("balance", "balance.valid", "invalid balance");
//
//		else if (account.getEquityAllocation() ==null)
//			errors.rejectValue("equityAllocation", "equityAllocation.valid", "Equity Allocation can not be null");
//		
//		else if (account.getEquityAllocation() < 1000)
//			errors.rejectValue("equityAllocation", "equityAllocation.valid", "Equity Allocation must be >1000");
//		
//		else if (account.getGender() == null)
//			errors.rejectValue("gender", "gender.valid", "Select Gender");
//
//		else if (account.getActtype().length == 0)
//			errors.rejectValue("acttype", "acttype.minlength", "Select Account Type");
//
//	}
	
	@Override
	public void validate(Object target, Errors errors) {
		
		
		ValidationUtils.rejectIfEmpty(errors, "name", "name.required");
		ValidationUtils.rejectIfEmpty(errors, "balance", "balance.required");
		ValidationUtils.rejectIfEmpty(errors, "equityAllocation", "equityAllocation.required");
		ValidationUtils.rejectIfEmpty(errors, "accountCreationDate", "accountcreationdate.required");
		ValidationUtils.rejectIfEmpty(errors, "gender", "gender.needed","select the gender");
		ValidationUtils.rejectIfEmpty(errors, "acttype", "acttype.needed","select the account type");
	}
}
