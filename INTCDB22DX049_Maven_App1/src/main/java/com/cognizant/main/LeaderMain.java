package com.cognizant.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.model.Car;
import com.cognizant.model.Leader;

public class LeaderMain {

	public static void main(String[] args) {

		BeanFactory factory = new ClassPathXmlApplicationContext("application.xml");
		
		Leader leader = factory.getBean(Leader.class);
		

		System.out.println(leader);
	}
}
