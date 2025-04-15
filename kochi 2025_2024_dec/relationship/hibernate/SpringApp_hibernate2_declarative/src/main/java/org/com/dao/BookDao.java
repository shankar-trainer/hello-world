package org.com.dao;

import java.util.List;

import org.com.model.Book;

public interface BookDao {

	public Book addBook(Book b);
	public Book removeBook(long isbn);
	public Book updateBook(Book b);
	public Book searchBook(long isbn);
	public List<Book> getAllBook();
}
