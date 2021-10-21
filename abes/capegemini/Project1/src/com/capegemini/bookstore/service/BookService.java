package com.capegemini.bookstore.service;

import com.capegemini.bookstore.dto.Book;
import com.capegemini.bookstore.exception.BookException;

public interface BookService {

	void searchBook(int isbn)throws BookException;
	void addBooktoKart(Book book);
	void totalCost();
	void removeBook(int isbn)throws BookException;
	void allBookDetail();
   	
}
