package com.pathinfotech.aop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		Calculator bean = ctx.getBean(Calculator.class);
		bean.add(11, 4);
		bean.subtraction(11, 4);
		bean.multiplication(11, 4);
		bean.division(11, 4);
		try {
			bean.division(11, 0);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
	}
}
