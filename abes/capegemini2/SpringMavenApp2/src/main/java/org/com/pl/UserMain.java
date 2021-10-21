package org.com.pl;

import java.util.Locale;

import org.com.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {

	public static void main(String[] args) {

		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("user.xml");

		User bean1 = beanFactory.getBean("user1", User.class);
		System.out.println(bean1);

		User bean2 = beanFactory.getBean("user2", User.class);
		System.out.println(bean2);

		MessageSource bean = beanFactory.getBean("messageSource", MessageSource.class);

		String country = bean.getMessage("country", null, Locale.getDefault());

		String capital = bean.getMessage("capital", null, Locale.getDefault());

		System.out.println("Country is " + country);
		System.out.println("Capital is " + capital);

		String name = bean.getMessage("name", null, Locale.getDefault());
		String msg = bean.getMessage("msg", null, Locale.getDefault());
		System.out.println(msg + " " + name);
		
		msg = bean.getMessage("msg", null, Locale.FRENCH);
		System.out.println("In french "+msg + " " + name);

	}
}
