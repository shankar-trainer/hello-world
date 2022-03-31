package com.capgemini.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.HelloWorld;

public class HelloWorldMain {

	public static void main(String[] args) {
		BeanFactory beanfactory=new ClassPathXmlApplicationContext("beans.xml");

		HelloWorld helloWorld=		(HelloWorld) beanfactory.getBean("hello1");
		
		helloWorld.greeting();
		
	}
}
