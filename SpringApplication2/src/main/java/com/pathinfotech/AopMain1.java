package com.pathinfotech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pathinfotech.aop.Code;

public class AopMain1 {

	public static void main(String[] args) {
		
	  ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
	  Code code = applicationContext.getBean("code",Code.class);
	  code.display();
	}
}
