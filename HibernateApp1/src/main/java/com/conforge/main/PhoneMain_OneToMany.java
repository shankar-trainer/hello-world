package com.conforge.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.conforge.model.onetoone_bidirectional.Car;
import com.conforge.model.onetoone_bidirectional.Person;
import com.conforge.model.onetoone_bidirectional.Phone;
import com.conforge.util.SessionFactoryUtil;

public class PhoneMain_OneToMany {

	public static void main(String[] args) {
		Session session = SessionFactoryUtil.getSessionFactory().openSession();
		Transaction transaction = session.getTransaction();

		Phone phone = new Phone();

		phone.setPhoneCost(5600);
		phone.setPhoneModel("samsung");

		Person person = new Person();
		person.setPersonName("sunil kumar");
		person.setPersonSalary(56000);

		person.setPhone(phone);

		Car car[] = new Car[3];
		
		car[0] = new Car();
		car[0].setCardModel("maruti suzuki");
		car[0].setCardCost(50000);

		car[1] = new Car();
		car[1].setCardModel("hundai");
		car[1].setCardCost(70000);

		car[2] = new Car();
		car[2].setCardModel("honda city");
		car[2].setCardCost(120000);

		Set<Car> set1 = new HashSet<Car>();
		set1.add(car[0]);
		set1.add(car[1]);
		set1.add(car[2]);

		person.setCarSet(set1);

		transaction.begin();

		session.save(phone);
		for (Car c1 : set1)
			session.save(c1);

		session.save(person);
		transaction.commit();

		System.out.println("uni directional transaction completed");

		System.out.println("\n\nperson " + person);
		System.out.println("phone " + phone);

	}
}
