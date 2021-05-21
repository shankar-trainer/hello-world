package com.cts;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Leader;

public class LeaderMain {

	public static void main(String[] args) {

//		BeanFactory beanFactory = new ClassPathXmlApplicationContext("application.xml");
		ConfigurableApplicationContext beanFactory = new ClassPathXmlApplicationContext("application.xml");

		Leader leader = beanFactory.getBean("leader", Leader.class);

		System.out.println(leader);

		beanFactory.close();

	}
}
