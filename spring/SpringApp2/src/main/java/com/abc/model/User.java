package com.abc.model;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
//@Component(value = "user1")
@Component
@Scope(value = "prototype")

public class User {
	
	private long userId;
	private String  userName;
	private float userSalary;
	
	@Autowired
	private Car car;
	
	@PostConstruct
	public void init() {
		System.out.println(getClass().getSimpleName()+" init called");
		this.userId=98988;
		this.userName="suresh kumar";
		this.userSalary=900000;
		
		
	}
	
	

}
