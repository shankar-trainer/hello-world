package com.cognizant.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOpMain1 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		//MyCode code1 = ctx.getBean("code", MyCode.class);
		
		MyCode code1 = ctx.getBean(MyCode.class);
		
		code1.display1();
		
	}
}
