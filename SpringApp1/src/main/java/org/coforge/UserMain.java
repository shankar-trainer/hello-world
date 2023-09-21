package org.coforge;

import org.coforge.bean.User;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {

	public static void main(String[] args) {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		ConfigurableApplicationContext  ctx = new ClassPathXmlApplicationContext("beans.xml");
		User u = ctx.getBean(User.class);
		 
		System.out.println(u);
		
		ctx.close();
		

	}
}
