package com.pathinfotech.aop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		Calculator bean = ctx.getBean(Calculator.class);
		 bean.add(11, 4);
	}
}
