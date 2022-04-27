package com.cognizant.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.aop.Code;

public class AspectMain1 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		Code code = ctx.getBean(Code.class);
		code.display();
	}
}
