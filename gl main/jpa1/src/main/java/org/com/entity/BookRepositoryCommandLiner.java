package org.com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public class BookRepositoryCommandLiner implements CommandLineRunner {

	@Autowired
	BookRepository bookRepository;

	//@Override
	public void run(String... args) throws Exception {
		Book book = new Book();
		book.setIsbn(1111);
		book.setBname("java book");
		book.setCost(700.7f);
	}

}
