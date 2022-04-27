package com.cognizant.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.cognizant.bean.User;

@Configuration
public class AppConfig {

	@Bean
	@Scope(scopeName = "prototype")
	public User userBean() {
		User user1 = new User();
		user1.setUserId(10001);
		user1.setUserName("suresh kumar");
		user1.setUserSalary(12000);
		return user1;
	}
}
