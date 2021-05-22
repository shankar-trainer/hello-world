package org.cts.controller;

import org.cts.model.Account;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class AccountValidation  implements Validator{

	public boolean supports(Class<?> clazz) {
		return Account.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
	
		/*ValidationUtils.rejectIfEmpty(errors, "actId", "actId.required","account id is blank");
		ValidationUtils.rejectIfEmpty(errors, "actHolderName", "actHolderName.required","account name is blank");
		ValidationUtils.rejectIfEmpty(errors, "actBalance", "actBalance.required","account balnace is blank");

		ValidationUtils.rejectIfEmpty(errors, "hobbies", "hobbies.required","select hobby ");
		ValidationUtils.rejectIfEmpty(errors, "gender", "gender.required","select gender");
*/
		
		ValidationUtils.rejectIfEmpty(errors, "actId", "actId.required");
		ValidationUtils.rejectIfEmpty(errors, "actHolderName", "actHolderName.required");
		ValidationUtils.rejectIfEmpty(errors, "actBalance", "actBalance.required");
		
		ValidationUtils.rejectIfEmpty(errors, "hobbies", "hobbies.required");
		ValidationUtils.rejectIfEmpty(errors, "gender", "gender.required");
	}

}
