package org.capg.main;

import org.capg.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookMain {

	public static void main(String[] args) {
		//ApplicationContext
	 ConfigurableApplicationContext	context = new 
			 ClassPathXmlApplicationContext("applicationContext.xml");
		Book b1 = context.getBean(Book.class);
		System.out.println(b1.getBookIsbn());
		System.out.println(b1.getBookName());
		System.out.println(b1.getBookCost());
		
		context.close();
	}
}
