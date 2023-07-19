package com.coforge.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Hello;

public class HelloMain {

	public static void main(String[] args) {
		
		BeanFactory factory=new ClassPathXmlApplicationContext("beans.xml");
		
		Hello hello = (Hello) factory.getBean("hello1");
		hello.sayHello();
		
		Hello hello1 =  factory.getBean("hello1",Hello.class);
		
		hello1.sayHello();
	}
}
