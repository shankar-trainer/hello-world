package org.com.app2.service;

import java.util.HashMap;
import java.util.Map.Entry;

import org.com.app2.dao.BookDao;
import org.com.app2.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service(value = "service")
public class BookServiceImpl implements BookService {

	@Autowired
	BookDao dao;
	
	public void addBook(Book book) {
			
		if(dao.addBook(book))
			System.out.println("book added");
		else
			System.out.println("book already present");
	}

	public void getAllBook() {
     for(Entry<Integer, Book> entry: dao.getAllBook().entrySet())
    	 System.out.println(entry.getValue());
	}
}
