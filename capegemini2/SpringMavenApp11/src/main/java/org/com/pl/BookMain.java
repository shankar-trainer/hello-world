package org.com.pl;

import org.com.model.Book;
import org.com.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookMain {

	public static void main(String[] args) {
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext
				("book.xml");
 
		Book bean = beanFactory.getBean("book2", Book.class);
		System.out.println(bean);
		
		Product bean2 = beanFactory.getBean("prd1",Product.class);
				
		System.out.println(bean2);
		
	}
}
