package org.com.collection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import app1.Book;
import app1.Customer;
import app1.Employee;
import app1.Student;

public class UserMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext beanFactory = new ClassPathXmlApplicationContext("User.xml");

		User user = beanFactory.getBean("user1", User.class);

		System.out.println(user);
		beanFactory.close();

	}

}
