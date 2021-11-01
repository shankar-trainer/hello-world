package org.com.app2;


import org.com.app2.model.Book;
import org.com.app2.service.BookServiceImpl;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookMain {

	public static void main(String[] args) {

		// BeanFactory
		// ApplicationContext
		ConfigurableApplicationContext beanFactory = new ClassPathXmlApplicationContext("Book.xml");

		BookServiceImpl bservice = beanFactory.getBean("service", BookServiceImpl.class);

		Book book1=new Book(1234, "book1","a kumar");
		Book book2=new Book(1235, "book2","b kumar");
		Book book3=new Book(1236, "book3","p kumar");
	
		
		bservice.addBook(book1);
		bservice.addBook(book2);
		bservice.addBook(book3);
		bservice.addBook(book1);
		
		bservice.getAllBook();
		
		beanFactory.close();

	}

}
