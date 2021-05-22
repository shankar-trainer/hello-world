package org.cts.main;

import org.cts.beans.Birthday;
import org.cts.beans.CollectionDemo;
import org.cts.beans.Employee;
import org.cts.beans.Kid;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class KidMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");

		Kid kid1 = context.getBean("kid1", Kid.class);
		System.out.println(kid1);

		System.out.println(kid1.getKid_Id());
		System.out.println(kid1.getKid_Name());
		System.out.println(kid1.getLocation());

		System.out.println("Birthday ");
		Birthday birthday = kid1.getBday();

		System.out.println(birthday.getDay() + "-" + birthday.getMonth() + "-" + birthday.getYear());

	}
}
