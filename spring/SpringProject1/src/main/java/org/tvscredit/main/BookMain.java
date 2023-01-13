package org.tvscredit.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tvscredit.model.Book;

public class BookMain {

	public static void main(String[] args) {

		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		Book b =  factory.getBean("book1",Book.class);
		
		System.out.println("Book Information ");
		
		System.out.println("isbn "+b.getIsbn());
		System.out.println("name "+b.getBname());
		System.out.println("cost "+b.getCost());
		System.out.println("author "+b.getAuthor());

	}

}
