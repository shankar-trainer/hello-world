package org.com.app2;

import org.com.app2.model.Book;
import org.com.app2.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@ComponentScan("org.com.dao")
@ComponentScan("org.com.service")
@ComponentScan(basePackages = { "org.com.app2.dao", "org.com.app2.service", "org.com.app2.model" })

@EnableAutoConfiguration
//@Configuration
@Controller
//@Component

public class BookMain2 {

//@Autowired
//static BookServiceImpl bservice;

	public static void main(String[] args) {

		ApplicationContext ctx=		SpringApplication.run(BookMain2.class,args);
		BookServiceImpl bservice = ctx.getBean("bookServiceImpl", BookServiceImpl.class);
		
		
		Book book1=new Book(1234, "book1","a kumar");
		Book book2=new Book(1235, "book2","b kumar");
		Book book3=new Book(1236, "book3","p kumar");
		
		bservice.addBook(book1);
		bservice.addBook(book2);
		bservice.addBook(book3);
		bservice.addBook(book1);
		bservice.getAllBook();
	}

}
