package com.cognizant.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cognizant.bean.User;
import com.cognizant.config.AppConfig;

public class UserMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		User user = ctx.getBean(User.class);
		System.out.println(user.getUserId() + "\t" + user.getUserName() + "\t" + user.getUserSalary());
		
		User user1 = ctx.getBean(User.class);
		User user2 = ctx.getBean(User.class);
		
		user1.setUserId(1);
		user1.setUserName("amit kumar");
		user1.setUserSalary(20000);
		
		user2.setUserId(2);
		user2.setUserName("sumit kumar");
		user2.setUserSalary(40000);
		
		System.out.println("\nuser1 data\n");
		System.out.println(user1.getUserId() + "\t" + user1.getUserName() + "\t" + user1.getUserSalary());
		
		System.out.println("\nuser2 data\n");
		System.out.println(user2.getUserId() + "\t" + user2.getUserName() + "\t" + user2.getUserSalary());
		
		
		
		
	}

}
