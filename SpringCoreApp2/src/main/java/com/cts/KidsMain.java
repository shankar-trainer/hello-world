package com.cts;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cts.model.Home;
import com.cts.model.Kids;

public class KidsMain {

	public static void main(String[] args) {

		// BeanFactory beanFactory
		//ApplicationContext 
ConfigurableApplicationContext		beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");

		Kids k = beanFactory.getBean("kid", Kids.class);
		System.out.println(k.getKidsId());
		System.out.println(k.getKidsName());
		System.out.println(k.getKidsAge());
		
		System.out.println("\nkids home \n");
		System.out.println(k.getHome().getHomeId());
		System.out.println(k.getHome().getHomeName());
		Home home=k.getHome();
		System.out.println(home.getHomeLocation());
	beanFactory.close();
	}
}
