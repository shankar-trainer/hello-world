package com.cognizant.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.model.HelloWorld;

public class HelloWorldMain {

	public static void main(String[] args) {
		
		BeanFactory factory=new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld bean = (HelloWorld) factory.getBean("h");
		bean.hello();
	}
}
