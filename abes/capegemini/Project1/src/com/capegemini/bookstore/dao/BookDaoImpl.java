package com.capegemini.bookstore.dao;

import java.util.HashMap;

import com.capegemini.bookstore.dto.Book;

public class BookDaoImpl implements BookDao {

	HashMap<Integer, Book> bookmap;

	public BookDaoImpl() {
		bookmap = new HashMap<>();
	}

	@Override
	public boolean addBook(Book book) {
		if(searchBook(book)==null) {
		bookmap.put(book.getIsbn(), book);
		return true;
		}
		return false;
	}

	@Override
	public HashMap<Integer, Book> getAllBook() {
		return bookmap;
	}

	@Override
	public Book searchBook(Book book) {
		if (bookmap.containsKey(book.getIsbn()))
			return bookmap.get(book.getIsbn());
		else
			return null;
	}

	@Override
	public boolean deleteBook(Book book) {
		if(searchBook(book)!=null) {
			bookmap.remove(book.getIsbn());
		  return true;
		}
		return false;
	}

}
