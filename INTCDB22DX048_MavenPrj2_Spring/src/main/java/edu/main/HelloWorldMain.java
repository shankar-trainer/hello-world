package edu.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.example.model.HelloWorld;

public class HelloWorldMain {

	public static void main(String[] args) {

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		HelloWorld helloWorld = (HelloWorld) beanFactory.getBean("hello");

		helloWorld.welcome();
		
		HelloWorld helloWorld1 = (HelloWorld) beanFactory.getBean("hello");

		System.out.println(helloWorld.getFactorial(5));

		System.out.println(helloWorld1.getFactorial(6));
		

	}
}
