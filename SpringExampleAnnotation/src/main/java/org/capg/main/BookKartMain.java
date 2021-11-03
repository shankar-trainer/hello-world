package org.capg.main;

import org.capg.dao.BookKart;
import org.capg.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookKartMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		BookKart bookKart = context.getBean(BookKart.class);

		bookKart.getAllBook()
				.forEach(a -> System.out.println(a.getBookIsbn() + "   " + a.getBookName() + "  " + a.getBookCost()));

		System.out.println("first book");
		Book b1 = bookKart.getFirstBook();
		System.out.println(b1.getBookIsbn() + "   " + b1.getBookCost() + "  " + b1.getBookName());

		System.out.println("\nlast book");
		b1 = bookKart.getLastBook();
		System.out.println(b1.getBookIsbn() + "   " + b1.getBookCost() + "  " + b1.getBookName());

	}
}
