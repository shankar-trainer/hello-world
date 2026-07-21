package com.coforge;

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

public class AddressMain_BiDirection {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.getTransaction();
		
		transaction.begin();
		
		Address address=new Address();
		address.setCity("jaipur");
		address.setState("rajsthan");
		
		Person  person=new Person();
		person.setName("ajay kumar");
		person.setAddress(address);
		person.setGender(Gender.male);
		
		address.setPerson(person);
		
		
		Car car[]=new Car[3];
		car[0]=new Car();
		car[0].setModel("maruti");
		car[0].setCost(600000);
		car[0].setPerson(person);
		
		car[1]=new Car();
		car[1].setModel("hundai verna");
		car[1].setCost(2000000);
		car[1].setPerson(person);
		
		car[2]=new Car();
		car[2].setModel("ambassador");
		car[2].setCost(900000);
		car[2].setPerson(person);
		
		Set<Car> carSet = Stream.of(car).collect(Collectors.toSet());
		
		person.setCarSet(carSet);
		
		session.persist(car[0]);
		session.persist(car[1]);
		session.persist(car[2]);
		
		session.persist(address);
		
		transaction.commit();
		
		
	}
}
