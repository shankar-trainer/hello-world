package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.cofig.SpringConfig;
import com.coforge.model.User;

public class UserMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext
				 (SpringConfig.class);;
		 User user = ctx.getBean(User.class);
		
		 System.out.println(user);
		
	}
}
