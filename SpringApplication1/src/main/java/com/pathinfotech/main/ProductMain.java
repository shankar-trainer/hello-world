package com.pathinfotech.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pathinfotech.model.HelloWorld;
import com.pathinfotech.model.Product;

public class ProductMain {

	public static void main(String[] args) {
		
	//	BeanFactory beanFactory=new ClassPathXmlApplicationContext("beans.xml");
		BeanFactory beanFactory=new FileSystemXmlApplicationContext("C:\\test\\workspace99\\SpringApplication1\\src\\main\\resources\\beans.xml");
		 
		Product bean = beanFactory.getBean(Product.class); 
		System.out.println(bean);
		 
	}
}
