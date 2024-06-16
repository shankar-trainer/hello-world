package com.coforge;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Book;

public class BookMain {
	public static void main(String[] args) {
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("application.xml");
		
//		Book bean = beanFactory.getBean("book1",Book.class);
//		Book bean = beanFactory.getBean("book",Book.class);
		Book bean = beanFactory.getBean(Book.class);
		System.out.println(bean);
	}

}
