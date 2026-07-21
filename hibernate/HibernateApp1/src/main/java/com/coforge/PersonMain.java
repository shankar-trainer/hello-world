package com.coforge;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.model.Address;
import com.coforge.model.Car;
import com.coforge.model.Gender;
import com.coforge.model.Person;

public class PersonMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.getTransaction();

		Person person = new Person();
		person.setName("ram kumar");
		person.setGender(Gender.male);

		Address address = new Address();

		address.setCity("noida");
		address.setState("up");
		
		person.setAddress(address);
		
		Car car[]=new Car[3];
		car[0]=new Car();
		car[0].setModel("maruti");
		car[0].setCost(600000);
		
		car[1]=new Car();
		car[1].setModel("hundai verna");
		car[1].setCost(2000000);
		
		car[2]=new Car();
		car[2].setModel("ambassador");
		car[2].setCost(900000);
		
		Set<Car> carSet = Stream.of(car).collect(Collectors.toSet());
		
		person.setCarSet(carSet);
		
		transaction.begin();
//		session.persist(address);
		session.persist(person);
		transaction.commit();
		//sysout -- ctrl+space 
 	List<Person> list1=	session.createQuery("from Person").list();
		System.out.println(list1);
	
	}
}
