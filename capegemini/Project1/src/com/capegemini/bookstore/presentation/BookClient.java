package com.capegemini.bookstore.presentation;

import com.capegemini.bookstore.dto.Book;
import com.capegemini.bookstore.exception.BookException;
import com.capegemini.bookstore.service.BookService;
import com.capegemini.bookstore.service.BookServiceImpl;

public class BookClient {

	public static void main(String[] args) {
		
		int isbn[]= {34556,6788,667788};
		String name[]= {"java book","oracle book","angular book"};
		float cost[]= {678,567,345};
		
		BookService bookService=new BookServiceImpl();
	
		Book book[]=new Book[3];
		 for (int i = 0; i < book.length; i++) {
			book[i]=new Book(isbn[i], name[i], cost[i]);
			bookService.addBooktoKart(book[i]);
		}
	   bookService.allBookDetail();	 
	   try {
		//bookService.searchBook(isbn[2]);
		   bookService.searchBook(0);
		
	} catch (BookException e) {
	           System.err.println(e.getMessage());
	}
	}
}
