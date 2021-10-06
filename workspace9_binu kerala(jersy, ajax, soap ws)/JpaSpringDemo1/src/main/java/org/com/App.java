package org.com;

import org.com.config.AppConfig;
import org.com.service.CustomerService;
import org.com.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext
				(AppConfig.class);
		
		CustomerService service = ctx.getBean(CustomerServiceImpl.class);
		
		service.getAllCustomer();

		
	}
}
