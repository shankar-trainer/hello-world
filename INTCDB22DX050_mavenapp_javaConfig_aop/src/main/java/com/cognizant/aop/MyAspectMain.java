package com.cognizant.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAspectMain {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		MyCode code = ctx.getBean(MyCode.class);

		code.welcome();
	}
}
