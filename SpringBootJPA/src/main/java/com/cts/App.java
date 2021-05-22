package com.cts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.dao.BookDao;
import com.cts.model.Book;

@SpringBootApplication
public class App {

	// @Autowired
	// static BookDao dao;

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);
/*		BookDao dao = ctx.getBean(BookDao.class);

		Book book1 = new Book();
		//book1.setISBN(11223);
		book1.setAuthor("a kumar");
		book1.setCost(15000);

		Book book2 = new Book();
		//book2.setISBN(11224);
		book2.setAuthor("p kumar");
		book2.setCost(15000);

		Book book3 = new Book();
		//book3.setISBN(11225);
		book3.setAuthor("s kumar");
		book3.setCost(15000);

		dao.addBook(book1);
		dao.addBook(book2);
		dao.addBook(book3);

		List<Book> allBook = dao.getAllBook();
		for (Book b : allBook)
			System.out.println(b.getAuthor() + " " + b.getISBN() + "  " + b.getCost());
*/
		
	}
}
