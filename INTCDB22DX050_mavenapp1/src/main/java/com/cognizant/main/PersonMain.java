package com.cognizant.main;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.model.Person;
import com.cognizant.model.Phone;

public class PersonMain {

	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("application.xml");

		Person person = factory.getBean("person1", Person.class);

		System.out.println("id " + person.getId());
		System.out.println("name " + person.getName());
		System.out.println("salary  " + person.getSalary());

		System.out.println("\ncar list ");
		for (String s : person.getCarList())
			System.out.println("\t" + s);

		System.out.println("\nphone set  ");
		for (Phone p : person.getPhoneSet()) {
			System.out.println("\n\treg no" + p.getRegNo());
			System.out.println("\tmodel" + p.getModel());
			System.out.println("\tcost" + p.getCost());
		}

		System.out.println("book map ");
		Map<String, String> map1 = person.getBookMap();

		System.out.println("\tauthor\tname");
		for (Entry<String, String> e : map1.entrySet()) {
			System.out.println("\t" + e.getKey() + "\t" + e.getValue());
		}

	}
}
