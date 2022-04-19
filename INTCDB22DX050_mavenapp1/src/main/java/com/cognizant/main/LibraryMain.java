package com.cognizant.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.model.Book;
import com.cognizant.model.Library;

public class LibraryMain {

	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("application2.xml");

		Library bean = factory.getBean(Library.class);

		System.out.println("library  info");
		System.out.println(bean.getLibId());
		System.out.println(bean.getLibname());
		System.out.println(bean.getLibLocation());
		
		System.out.println("book info");
		Book book=bean.getBook();
		
		System.out.println(book.getIsbn());
		System.out.println(book.getCost());
		System.out.println(book.getBname());
	}
}
