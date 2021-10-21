package org.com.dao;

import java.util.HashMap;

import org.com.model.Book;
import org.springframework.stereotype.Repository;

//@Repository
public interface BookDao {

	public boolean addBook(Book book);
	public HashMap<Integer, Book> getAllBook();

}
