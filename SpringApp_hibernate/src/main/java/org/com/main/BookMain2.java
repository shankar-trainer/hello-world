package org.com.main;

import org.com.cofig.ApplicationConfig;
import org.com.dao.BookDao;
import org.com.dao.BookDaoImpl;
import org.com.exception.BookException;
import org.com.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookMain2 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		BookDao dao = context.getBean(BookDaoImpl.class);

		try {
			System.out.println("add record");

			Book book = new Book();
			book.setBname("spring in action");
			book.setCost(1200);

			dao.addBook(book);
		} catch (BookException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("get all record");
			dao.getAllBook().forEach(a -> System.out.println(a));
		} catch (BookException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("search record");

			dao.searchBook(1);
		} catch (BookException e) {
			System.out.println(e.getMessage());
		}
	}
}
