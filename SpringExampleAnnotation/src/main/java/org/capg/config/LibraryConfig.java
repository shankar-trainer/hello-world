package org.capg.config;

import org.capg.model.Book;
import org.capg.model.Library;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class LibraryConfig {
	
	@Bean()
	@Scope("prototype")
	public Library getLibrary1() {
	   Library library=new Library();
	   library.setLibraryId(6667767);
	   library.setLibraryName("nehru library");
	   library.setLibraryLocation("chennai");
	   library.setLibraryCapacity(1000);
	   return library;
	}
	
	@Bean(name = "book1")
	@Scope("prototype")
	public Book getBook() {
		Book b1=new Book();
		b1.setBookIsbn(65465);
		b1.setBookName("python beginner");
		b1.setBookCost(1234);
		return b1;
	}
	
	@Bean(name = "book2")
	@Scope("prototype")
	public Book getBook1() {
		Book b1=new Book();
		b1.setBookIsbn(65);
		b1.setBookName("let us c");
		b1.setBookCost(800);
		return b1;
	}
	
	
}
