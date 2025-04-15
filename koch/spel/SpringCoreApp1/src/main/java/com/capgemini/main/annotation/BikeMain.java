package com.capgemini.main.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.annotation.Bike;

public class BikeMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application2.xml");

		Bike bike = ctx.getBean("bike1", Bike.class);

		System.out.println("bike reg no " + bike.getRegNo());
		System.out.println("bike model  " + bike.getModel());
		System.out.println("bike cost  " + bike.getCost());
	}
}
