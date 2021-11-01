package org.com.pl;

import java.util.HashMap;

import org.com.dao.BookDaoImpl;
import org.com.model.Book;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@ComponentScan(basePackages = { "org.com.dao", "org.com.model" })
public class BookMain {

	public static void main(String[] args) {

		// ConfigurableApplicationContext beanFactory = new
		// ClassPathXmlApplicationContext("Book.xml");
		AnnotationConfigApplicationContext beanFactory = new AnnotationConfigApplicationContext(AppConfig.class);

		BookDaoImpl bservice = beanFactory.getBean(BookDaoImpl.class);

		Book book1 = new Book(1234, "book1", "a kumar");
		Book book2 = new Book(1235, "book2", "b kumar");
		Book book3 = new Book(1236, "book3", "p kumar");

		bservice.addBook(book1);
		bservice.addBook(book2);
		bservice.addBook(book3);
		bservice.addBook(book1);

		HashMap<Integer, Book> allBook = bservice.getAllBook();

		System.out.println(allBook.values());
		beanFactory.close();
	}
}
