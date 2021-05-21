package com.cts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.model.AppConfig;
import com.cts.model.User;

public class UserMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(AppConfig.class);

		User user = applicationContext.getBean(User.class);
		user.setUserId(1);
		user.setUserName("s kumar");
		user.setUserSalary(88000);
		
		System.out.println(user.getUserId());
		System.out.println(user.getUserName());
		System.out.println(user.getUserSalary());
		
		User user1 = applicationContext.getBean(User.class);
		
		System.out.println(user1.getUserId());
		System.out.println(user1.getUserName());
		System.out.println(user1.getUserSalary());
	}
}
