package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.dao.BookDao;
import com.example.model.Book;

@SpringBootApplication
public class SpringBootMvc11Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootMvc11Application.class, args);
	
		BookDao dao=  ctx.getBean(BookDao.class);
	
	  Book book1=new Book();
	  Book book2=new Book();
	  Book book3=new Book();
		
     book1.setBook_name("spring in action");
     book1.setBook_cost(678.0f);
     
     book2.setBook_name("spring beginner");
     book2.setBook_cost(890.0f);
     
     book3.setBook_name("spring recipee");
     book3.setBook_cost(2678.0f);
     
     dao.addBook(book1);
     dao.addBook(book2);
     dao.addBook(book3);
     
     
     List<Book> allBook = dao.getAllBook();
     
     for (Book book : allBook) {
		System.out.println(book);
	}
     
     
	  
	}

}
