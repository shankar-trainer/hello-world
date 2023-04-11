package org.audintel;

import org.audintel.model.Customer;
import org.audintel.model.CustomerImpl;
import org.audintel.model.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
		
		User bean = beanFactory.getBean(User.class);

		 System.out.println(bean);
		 
		 
	}
}
