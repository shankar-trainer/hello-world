package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Lawyer;

public class LawyerMain {

	public static void main(String[] args) {

		// ApplicationContext applicationContext
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

//		Lawyer bean = applicationContext.getBean(Lawyer.class);
//		Lawyer bean = applicationContext.getBean("lawyer",Lawyer.class);
// default instance is classname first letter small case i.e Lawyer -- lawyer

		Lawyer bean = applicationContext.getBean("lawyer1", Lawyer.class);
		Lawyer bean1 = applicationContext.getBean("lawyer1", Lawyer.class);
		
		bean1.setId(1);
		bean1.setName("jai kumar");
		bean1.setSalary(25000);
		
		
		System.out.println(bean);
		System.out.println(bean1);
		
		
		
		applicationContext.close();
	}
}
