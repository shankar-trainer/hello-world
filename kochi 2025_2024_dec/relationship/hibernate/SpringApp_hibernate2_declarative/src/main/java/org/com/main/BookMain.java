package org.com.main;

import org.com.cofig.ApplicationConfig;
import org.com.dao.BookDao;
import org.com.dao.BookDaoImpl;
import org.com.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookMain {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		BookDao dao = context.getBean(BookDaoImpl.class);
	
		System.out.println("add record");
		
		Book book=new Book();
		book.setBname("spring in action");
		book.setCost(1200);
		
		Book addBook = dao.addBook(book);
		if(addBook!=null)
			System.out.println("Book added "+addBook);
		else
			System.out.println("Book already present ");
			

		System.out.println("get all record");
	    dao.getAllBook().forEach(a->System.out.println(a));
	    
	    System.out.println("search record");
	    
	    Book searchBook = dao.searchBook(1);
	 
	    if(searchBook!=null)
	    	System.out.println("found "+searchBook);
	    else
	    	System.out.println("not found ");
	}
}
