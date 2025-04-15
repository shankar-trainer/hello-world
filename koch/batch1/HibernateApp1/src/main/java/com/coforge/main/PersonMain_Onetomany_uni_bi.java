package com.coforge.main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.coforge.model.one_to_many_uni_bi.Car;
import com.coforge.model.one_to_many_uni_bi.Person;

public class PersonMain_Onetomany_uni_bi {

	public static void main(String[] args) {
		Session session = MySessionFactoryUtil.getSessionFactory().openSession();

		Car car[] = new Car[3];

		car[0] = new Car();
		car[0].setCarModel("hundui");
		car[0].setCarCost(500000.0f);

		car[1] = new Car();
		car[1].setCarModel("maruti");
		car[1].setCarCost(300000.0f);

		car[2] = new Car();
		car[2].setCarModel("honda city");
		car[2].setCarCost(1000000.0f);

		Set<Car> carset = new HashSet<Car>();
		for (Car car2 : car) {
			carset.add(car2);
		}

		Person person = new Person();
		person.setPersonName("suresh kumar");
		person.setPersonSalary(120000);

		person.setCarSet(carset);

		session.getTransaction().begin();
// without cascading
		for (Car car2 : carset) {
			session.save(car2);
		}
		session.save(person);
		session.getTransaction().commit();

	}
}
