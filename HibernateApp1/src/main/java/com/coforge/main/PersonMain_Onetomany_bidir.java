package com.coforge.main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import com.coforge.model.one_to_many_uni_bi.Car;
import com.coforge.model.one_to_many_uni_bi.Person;

public class PersonMain_Onetomany_bidir {

	@SuppressWarnings("deprecation")
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

		car[0].setPerson(person);
		car[1].setPerson(person);
		car[2].setPerson(person);

		// person.setCarSet(carset);

		session.getTransaction().begin();
		for (Car car2 : carset) {
			session.save(car2);
		}
		session.save(person);
		session.getTransaction().commit();

		// bi directional Car to Person, Person - Car
		List<Car> list = session.createQuery("from Car").list();
		System.out.println("\n Car ");
		for (Car c : list) {
			System.out.println(c.getCarRegNo() + "\t" + c.getCarModel() + "\t" + c.getCarCost());

		}
		System.out.println("\nperson list\n");
		for (Car car2 : list) {
			Person person2 = car2.getPerson();
			System.err
					.println(person2.getPersonId() + "\t" + person2.getPersonName() + "\t" + person2.getPersonSalary());
		}
	}
}
