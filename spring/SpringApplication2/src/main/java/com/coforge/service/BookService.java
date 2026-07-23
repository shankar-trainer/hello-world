package com.coforge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.coforge.model.Book;

@Service
@ComponentScan("com.coforge.model")
public class BookService {

	@Autowired
//	@Qualifier("literatureBook")
//	@Qualifier("scienceBook")
	private Book book;
	
	public void getBookInfo() {
	  book.bookInfo();	
	}
}
