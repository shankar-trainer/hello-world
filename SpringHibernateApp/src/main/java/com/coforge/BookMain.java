package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.config.BookConfig;
import com.coforge.dao.BookDao;
import com.coforge.model.Book;

public class BookMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(BookConfig.class);
		BookDao dao = ctx.getBean(BookDao.class);
		
		Book book1=new Book();
		Book book2=new Book();
		
		book1.setBname("spring in action");
		book1.setCost(1500);
		
		book2.setBname("spring for beginner");
		book2.setCost(2100);
		
		dao.addBook(book1);
		dao.addBook(book2);
		
		dao.getAllBook().forEach(b->System.out.println(b));
		
		
	}
}
