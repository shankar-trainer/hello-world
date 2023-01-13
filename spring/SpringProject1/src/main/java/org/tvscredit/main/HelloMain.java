package org.tvscredit.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tvscredit.model.Hello;

public class HelloMain {

	public static void main(String[] args) {

		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		Hello h = (Hello) factory.getBean("hello1");
		h.show();
	}

}
