package org.com.app2.service;

import java.util.Map.Entry;

import org.com.dao.BookDao;
import org.com.model.Book;
import org.com.dao.BookDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//(value = "service")
public class BookServiceImpl  {

	@Autowired
	//BookDaoImpl dao1;
	BookDao dao1;
	
	public void addBook(Book book) {
			
		if(dao1.addBook(book))
			System.out.println("book added");
		else
			System.out.println("book already present");
	}

	public void getAllBook() {
     for(Entry<Integer, Book> entry: dao1.getAllBook().entrySet())
    	 System.out.println(entry.getValue());
	}
}
