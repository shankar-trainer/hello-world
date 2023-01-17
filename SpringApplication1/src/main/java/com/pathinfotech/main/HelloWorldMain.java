package com.pathinfotech.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pathinfotech.model.HelloWorld;

public class HelloWorldMain {

	public static void main(String[] args) {
		
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("beans.xml");
		 HelloWorld bean = (HelloWorld) beanFactory.getBean("hw");
		 
		 bean.display();
		 
	}
}
