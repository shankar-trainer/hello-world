package com.coforge.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Lazy(value = true)
public class User {

	private int userId;
	private  String userName;
	
	@PostConstruct
	public void init() {
		System.out.println("user init called");
	  this.userId=98989898;
	  this.userName="vikram kumar singh";
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
	}

	
}
