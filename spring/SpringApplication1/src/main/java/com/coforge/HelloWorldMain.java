package com.coforge;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.HelloWorld;

public class HelloWorldMain {
	public static void main(String[] args) {

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld world = (HelloWorld) beanFactory.getBean("he");
		world.hello();
	}
}
