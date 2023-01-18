package com.pathinfotech.dao;

import java.util.List;

import com.pathinfotech.model.Book;

public interface BookDao {

	public boolean addBook(Book b);

	public Book searchBook(long isbn);

	public boolean removeBook(long isbn);

	public boolean updateBook(Book b);

	public List<Book> showAllBook();

}
