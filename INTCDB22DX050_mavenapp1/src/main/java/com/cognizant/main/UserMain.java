package com.cognizant.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.model.User;

public class UserMain {

	public static void main(String[] args) {
		BeanFactory factory=new ClassPathXmlApplicationContext("beans.xml");
		
		User user=	factory.getBean("user1",User.class);
		System.out.println(user);	
		
		
		User user1=	factory.getBean("user1",User.class);
		
	}

}
