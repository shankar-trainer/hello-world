package com.coforge;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Address;
import com.coforge.model.Book;
import com.coforge.model.Employee;
import com.coforge.model.HelloWorld;
import com.coforge.model.Insurance;

public class BookMain {
	public static void main(String[] args) {
		//BeanFactory
//		ApplicationContext
		ConfigurableApplicationContext
		beanFactory = new ClassPathXmlApplicationContext("application.xml");
		
	
	Book book=beanFactory.getBean("book", Book.class);
	Book book1=beanFactory.getBean("book", Book.class);
	
	book1.setAuthor("a kumar");
	book1.setIsbn(76767676);
	book1.setBname("java pro");
	
	System.out.println(book);
	System.out.println(book1);
			
	
	beanFactory.close();
	}
}
