package com.cognizant.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans1.xml");
		Hello1 hello = ctx.getBean(Hello1.class);
		hello.hi();
		
		
		Hello1 hello1 = ctx.getBean(Hello1Impl.class);
		hello1.hi();
		
		Hello1Impl hello2 = ctx.getBean(Hello1Impl.class);
		hello2.hi();
		
		
		
	}

}
