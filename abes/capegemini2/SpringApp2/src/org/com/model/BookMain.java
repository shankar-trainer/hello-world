package org.com.model;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.com.model.Book;

public class BookMain {

	public static void main(String[] args) {
	
		ApplicationContext beanfactory= new ClassPathXmlApplicationContext("beans.xml");
		 Book bean= beanfactory.getBean("book1",Book.class);
		 System.out.println(bean);
	}
}
