package org.com.pl;

import org.com.model.Book;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookMain {

	public static void main(String[] args) {

		//ApplicationContext
		ConfigurableApplicationContext
		beanFactory = new ClassPathXmlApplicationContext("book.xml");

		Book bean = beanFactory.getBean("book1", Book.class);
		System.out.println(bean);
		
		beanFactory.close();

	}
}
