package com.cts.web;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cts.model.Product;

@Component
public class ShoppingKartValidator  implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Product.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		
		/*ValidationUtils.rejectIfEmpty(errors, "prdId", "prdId.requied","product id is empty");
		ValidationUtils.rejectIfEmpty(errors, "prdName", "prdName.requied","product name is empty");
		ValidationUtils.rejectIfEmpty(errors, "prdCost", "prdCost.requied","product cost is empty");
		ValidationUtils.rejectIfEmpty(errors, "prdLocation", "prdLocation.requied","product location is empty");
        */
		
		ValidationUtils.rejectIfEmpty(errors, "prdId", "prdId.requied");
		ValidationUtils.rejectIfEmpty(errors, "prdName", "prdName.requied");
		ValidationUtils.rejectIfEmpty(errors, "prdCost", "prdCost.requied");
		ValidationUtils.rejectIfEmpty(errors, "prdLocation", "prdLocation.requied","product location is empty");
	
		
	}
	
}
