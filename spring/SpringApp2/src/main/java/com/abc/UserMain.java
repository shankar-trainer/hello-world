package com.abc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.abc.model.User;

public class UserMain {
	public static void main(String[] args) {

//		BeanFactory  factory=new ClassPathXmlApplicationContext("beans.xml");
		BeanFactory  factory=new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
//		User user =factory.getBean("user1",User.class);
//		User user =factory.getBean("user",User.class);
		User user =factory.getBean(User.class);
		
		System.out.println(user);
		System.out.println("User data ");
		System.out.println("\tId"+user.getUserId());
		System.out.println("\tName"+user.getUserName());
		System.out.println("\tSalary"+user.getUserSalary());
		
		User user1 =factory.getBean(User.class);
	
		user1.setUserId(878787);
		user1.setUserName("anand kumar");
		user1.setUserSalary(34000);

		System.out.println("========================");
		System.out.println(user);
		System.out.println(user1);
		
		
	}
}
