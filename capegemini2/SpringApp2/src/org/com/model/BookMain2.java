package org.com.model;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.com.model.Book;

public class BookMain2 {

	public static void main(String[] args) {
	
		//ApplicationContext 
		//BeanFactory
//		beanfactory= new ClassPathXmlApplicationContext("beans.xml");
		//beanfactory= new FileSystemXmlApplicationContext("src\\beans.xml");
		
		Resource resource=new FileSystemResource("src\\beans.xml");
		
		XmlBeanFactory beanfactory=new XmlBeanFactory(resource);
		
		 
		Book bean= beanfactory.getBean("book1",Book.class);
		 System.out.println(bean);
	}
}
