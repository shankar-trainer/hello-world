package org.com.app2.dao;

import java.util.HashMap;


import org.com.app2.model.Book;

public interface BookDao {
	
   public boolean addBook(Book book);
   public HashMap<Integer, Book> getAllBook();
   
}
