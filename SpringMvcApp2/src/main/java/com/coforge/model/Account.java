package com.coforge.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class Account {
	@Min(value =  10000, message = "Account id must of minimum 10000")
	@Max(value=50000,message = "Account id must of maximum 50000")
	@NotNull(message = "account id is null")
	private Long accountId;
	
	@NotBlank(message = "Account Holder Name is Blank")
	@Size(max = 20, min = 5)
	private String accountHolderName;
	
	@Min(value = 5000, message = "Account balance  must of minimum 5000")
	@Max(value = 500000, message = "Account balance  must of maximum 500000")
	@NotNull(message = "account balace is  null")
	
	private Float balance;
}
