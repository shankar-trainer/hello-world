package org.coforge;

import org.coforge.bean.Hello;
import org.coforge.bean.HelloImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		BeanFactory ctx;
		ctx=new ClassPathXmlApplicationContext("beans.xml");
	
	 Hello h=(Hello)	ctx.getBean("hello");
	 HelloImpl h1=(HelloImpl)	ctx.getBean("hello");
		
	 h.display();
	 h1.display();
	}
}
