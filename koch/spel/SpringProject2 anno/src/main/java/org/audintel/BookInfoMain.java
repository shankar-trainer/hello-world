package org.audintel;

import org.audintel.model.Book;
import org.audintel.model.BookInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookInfoMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(BookInfo.class);
		BookInfo info = ctx.getBean("bookinfo",BookInfo.class);

		System.out.println("all books ");
		for (Book b : info.getBookList())
			System.out.println(b.getIsbn() + "\t" + b.getBname() + "\t" + b.getCost());

		System.out.println("first book");
		Book fbook = info.getFirstBook();

		System.out.println(fbook.getIsbn() + "\t" + fbook.getBname() + "\t" + fbook.getCost());

		System.out.println("\nlast book");
		fbook = info.getLastBook();

		System.out.println(fbook.getIsbn() + "\t" + fbook.getBname() + "\t" + fbook.getCost());

	}
}
