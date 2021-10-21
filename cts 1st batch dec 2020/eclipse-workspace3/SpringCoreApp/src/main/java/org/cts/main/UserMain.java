package org.cts.main;

import java.util.Locale;

import org.cts.beans.Student;
import org.cts.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {

	public static void main(String[] args) {

		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("beans1.xml");

		User user = beanFactory.getBean("user1", User.class);

		System.out.println(user);

		/*
		 * String msg1 = beanFactory.getMessage("user.name", null, null); String msg2 =
		 * beanFactory.getMessage("user.id", null, null); String msg3 =
		 * beanFactory.getMessage("user.country", null, null);
		 */
  /*
		String msg1 = beanFactory.getMessage("user.name", null, Locale.FRANCE);
		String msg2 = beanFactory.getMessage("user.id", null, Locale.FRANCE);
		String msg3 = beanFactory.getMessage("user.country", null, Locale.FRANCE);
	*/	
		Locale locale=new Locale("ta","IN");
		
		String msg1 = beanFactory.getMessage("user.name", null, locale);
		String msg2 = beanFactory.getMessage("user.id", null, locale);
		String msg3 = beanFactory.getMessage("user.country", null, locale);
		
		
		System.out.println(msg1 + " " + user.getId());
		System.out.println(msg2 + " " + user.getName());
		System.out.println(msg3 + " " + user.getCountry());
	}
}
