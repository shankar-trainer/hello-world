package org.com.pl;

import org.com.model.Book;
import org.com.model.Customer;
import org.com.model.Phone;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class BookMain {

	public static void main(String[] args) {

		// BeanFactory
		//ApplicationContext beanFactory = new ClassPathXmlApplicationContext("application.xml");

		// ApplicationContext
		// BeanFactory
//	beanfactory= new ClassPathXmlApplicationContext("application.xml");
		// beanfactory= new FileSystemXmlApplicationContext("src\\main\\resources\\application.xml");
		/*
		 * Resource resource = new FileSystemResource
		 * ("src\\main\\resources\\application.xml");
		 */

		//Resource resource = new ClassPathResource("book.xml");
		Resource resource = new ClassPathResource("application.xml");
		
		XmlBeanFactory beanfactory = new XmlBeanFactory(resource);

		Book bean = beanfactory.getBean("book1", Book.class);
		System.out.println(bean);

	}
}
