package org.capg.dao;

import java.util.List;

import org.capg.model.Book;

public interface BookDao {

	public List<Book> getAllBook();
	public boolean addBook(Book book);
	
}
