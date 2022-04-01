package com.capgemini.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.capgemini.beans.User;

@Configuration
public class UserConfiguration {

	User user;
	
	@Bean
	@Scope(value = "prototype")
	public User getUser() {
	    user=new User();
	    user.setUserId(767676);
	    user.setUserName("shyam kumar");
	    user.setUserSalary(120000);
	    return user;
	}
	
}
