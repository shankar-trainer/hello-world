package com.cts.web;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cts.model.Account;
@Component
public class AccountValidator  implements Validator  {

	@Override
	public boolean supports(Class<?> clazz) {
		return  Account.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
/*		ValidationUtils.rejectIfEmpty(errors, "name", "name.required","name is empty");
		ValidationUtils.rejectIfEmpty(errors, "balance", "balance.required","balance is empty");
		ValidationUtils.rejectIfEmpty(errors, "equityAllocation", "equityAllocation.required","Equity Allocation is empty");
		ValidationUtils.rejectIfEmpty(errors, "location", "location.required","location is empty");
	*/
		
			ValidationUtils.rejectIfEmpty(errors, "name", "name.required");
			ValidationUtils.rejectIfEmpty(errors, "balance", "balance.required");
			ValidationUtils.rejectIfEmpty(errors, "equityAllocation", "equityAllocation.required");
			ValidationUtils.rejectIfEmpty(errors, "location", "location.required");
			ValidationUtils.rejectIfEmpty(errors, "accountCreationDate", "accountcreationdate.required");
			
/*			
	   Account account=(Account)target;
	   
	   if(account.getName().length()<=10)
		   errors.rejectValue("name", "name.minlength","name length must of >10 characters");
	   
	     if(account.getBalance()<=0.0f)
		   errors.rejectValue("balance", "balance.valid","balance must be >=0");
	   
	   if(account.getEquityAllocation()<1000)
		   errors.rejectValue("equityAllocation", "equityAllocation.valid","EquityAllocation must be >1000");
	   
	   if(account.getLocation().length()<=5)
		   errors.rejectValue("location", "location.minlength","location must of >5  characters");
	*/
			
	}

}
