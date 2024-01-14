package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Book;
import com.coforge.model.Employee;

public class BookMain {

	public static void main(String[] args) {
		 
	  ApplicationContext beanFactory	= new       
	    		    ClassPathXmlApplicationContext("beans.xml");

	 Book book = beanFactory.getBean(Book.class);
	 
	 System.out.println(book);
	  
	}
}
