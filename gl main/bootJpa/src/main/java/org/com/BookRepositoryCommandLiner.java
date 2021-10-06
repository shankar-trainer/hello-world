package org.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookRepositoryCommandLiner implements CommandLineRunner {

	@Autowired
	BookRepository bookRepository;

	public void run(String... args) throws Exception {
		Book book = new Book();
		book.setIsbn(56566);
		book.setCost(667);
		book.setBook_name("spring boot in action");
		bookRepository.save(book);

		List<Book> list1 = bookRepository.findAll();

		for (Book book2 : list1) {
			System.out.println(book2.getIsbn() + "  " + book2.getBook_name()
					+ "  " + book2.getCost());
		}

		Book b1 = new Book();
		b1.setIsbn(1);
		bookRepository.delete(b1);
		System.out.println("book with isbn deleted ");

	}
}
