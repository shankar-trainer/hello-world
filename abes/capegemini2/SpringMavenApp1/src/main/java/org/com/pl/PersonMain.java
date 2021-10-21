package org.com.pl;

import org.com.model.Customer;
import org.com.model.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {

		//BeanFactory 
	ApplicationContext 	beanFactory = new ClassPathXmlApplicationContext("application.xml");

		Person p1 = (Person) beanFactory.getBean("person1");
		System.out.println(p1.getPerson_id());
		System.out.println(p1.getPerson_location());
		System.out.println(p1.getPerson_name());
		System.out.println(p1.getCarList());
		System.out.println(p1.getMobileSet());
		System.out.println(p1.getStateCapital());
		System.out.println(p1.getCountryCapital());
	}
}
