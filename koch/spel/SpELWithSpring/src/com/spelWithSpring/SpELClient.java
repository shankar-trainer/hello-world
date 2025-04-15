package com.spelWithSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpELClient
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		Person person = context.getBean("personBean",Person.class);
		System.out.println("Age : " + person.getAge());
		System.out.println("Name : " + person.getName());
		System.out.println("City : " + person.getAddress().getCity());
		System.out.println("Rented Car Model :" + person.getRentedCar().getModel());
		System.out.println("Rented RV Model : " + person.getRentedRV().getModel()); 
	}
}
