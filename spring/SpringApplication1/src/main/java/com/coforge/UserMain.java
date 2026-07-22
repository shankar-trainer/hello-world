package com.coforge;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Employee;
import com.coforge.model.HelloWorld;
import com.coforge.model.User;

public class UserMain {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		User user = context.getBean("user", User.class);
		User user1 = context.getBean("user", User.class);
		
        user1.setUserId(1);
        user1.setUserName("hari parsad");
        user1.setUserAge(20);
        
        System.out.println(user);
        
        System.out.println(user1);
	}
}
