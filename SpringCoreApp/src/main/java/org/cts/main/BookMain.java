package org.cts.main;

import java.util.Locale;

import org.cts.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookMain {

	public static void main(String[] args) {

		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("context.xml");

		Book book = beanFactory.getBean("b1", Book.class);
		Book book1 = beanFactory.getBean("b1", Book.class);

		book1.setISBN(11111);
		book1.setBookName("angular in action");
		book1.setBookCost(6666);
		
		System.out.println(book.getISBN());
		System.out.println(book.getBookName());
		System.out.println(book.getBookCost());
		
		System.out.println("=====================");
		System.out.println(book1.getISBN());
		System.out.println(book1.getBookName());
		System.out.println(book1.getBookCost());

	}
}
