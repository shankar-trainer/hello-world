package org.com.pl;


import org.com.spel.Person;
import org.com.spel.PersonInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {

		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("department.xml");

		PersonInfo person = beanFactory.getBean("personInfo", PersonInfo.class);

		System.out.println(person.getFirstPerson());
		System.out.println(person.getLastPerson());

		System.out.println("all person list");
		for (Person p : person.getPersonList()) {
			System.out.println(p);
		}
	}
}
