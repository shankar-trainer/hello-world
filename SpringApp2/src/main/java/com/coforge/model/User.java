package com.coforge.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public abstract  class User {

	private int userId;
	private String  userName;
	private float userSalary;
	
	
	
}
