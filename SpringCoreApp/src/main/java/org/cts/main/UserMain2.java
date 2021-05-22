package org.cts.main;

import org.cts.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain2 {

	public static void main(String[] args) {

	 ConfigurableApplicationContext   beanFactory = new ClassPathXmlApplicationContext("application1.xml");

		User user = beanFactory.getBean("user", User.class);

		User user1 = beanFactory.getBean("user", User.class);
		
		user1.setuId(99999);
		user1.setName("vishal kumar");;
		
		
		user.setuId(99990);
		user.setName("anand kumar");;
		
		System.out.println(user);
		
		System.out.println(user1);
		
		beanFactory.close();
	}
}
