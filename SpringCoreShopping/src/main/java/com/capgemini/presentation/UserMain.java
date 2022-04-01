package com.capgemini.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.beans.User;
import com.capgemini.config.UserConfiguration;

public class UserMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(UserConfiguration.class);
		User u = ctx.getBean(User.class);
		
		User u1 = ctx.getBean(User.class);
		u1.setUserId(88898998);
		u1.setUserName("arbind kumar");;
		u1.setUserSalary(34000);

		System.out.println("User1 values\n");

		System.out.println(u.getUserId());
		System.out.println(u.getUserName());
		System.out.println(u.getUserSalary());

		System.out.println("\nUser2 values");
		
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserSalary());
	}
}
