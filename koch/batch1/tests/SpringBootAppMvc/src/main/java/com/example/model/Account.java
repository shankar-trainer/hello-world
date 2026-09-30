package com.example.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Account {

	
	@NotNull(message = "account id is null")
	//@NotBlank(message = "account id is blank")
	@Id
	private Integer accountId;
	
	@NotBlank(message = "account name is blank")
	private  String accountName;

	
	@NotNull(message = "account balance is null")
	private  Float accountBalance;
	
	private List<String> accountType;

	private List<String> gender;
	private List<String> cityList;
	
	
	
}
