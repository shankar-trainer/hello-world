package org.capg.main;

import java.util.Locale;

import org.capg.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		User user = ctx.getBean("user1", User.class);
		User user1 = ctx.getBean("user2", User.class);
		
		MessageSource msg = ctx.getBean("messageSource",MessageSource.class);
		
		
		System.out.println("\nuser1\n");
		System.out.println(msg.getMessage("user.id1", null,Locale.getDefault()) +"   "+user.getId());
		System.out.println(msg.getMessage("user.name1", null,Locale.getDefault()) +"   "+user.getName());
		
		System.out.println("\nuser1 in french\n");
		System.out.println(msg.getMessage("user.id1", null,Locale.FRENCH) +"   "+user.getId());
		System.out.println(msg.getMessage("user.name1", null,Locale.FRENCH) +"   "+user.getName());
		
		
		System.out.println("\nuser2\n");
		System.out.println(user1.getId());
		System.out.println(user1.getName());
		
		
		
		
	}

}
