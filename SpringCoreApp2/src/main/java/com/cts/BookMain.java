package com.cts;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Book;
import com.cts.model.Employee;

public class BookMain {

	public static void main(String[] args) {
		
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("beans.xml");
		
		Book b=  (Book)beanFactory.getBean("bk1");
	
		System.out.println(b);
		
		
		
	}
}
