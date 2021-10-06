package com.capegemini.bookstore.dao;

import java.util.HashMap;

import com.capegemini.bookstore.dto.Book;

public interface BookDao {

	boolean addBook(Book book);

	HashMap<Integer, Book> getAllBook();

	Book searchBook(Book book);

	boolean deleteBook(Book book);

}
