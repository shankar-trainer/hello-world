package org.com.oneToOne;

import org.com.HibernateUtil;
import org.com.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {

	public static void main(String[] args) {

		SessionFactory sf1 = HibernateUtil.getSF();
		Session session = sf1.openSession();
		Transaction transaction = session.beginTransaction();

		Person person = new Person();
		person.setName("ram kumar");

		Address address = new Address();
		address.setLocation("madurai");

		person.setAddress(address);

		transaction.begin();
		session.save(person);
		session.save(address);

		transaction.commit();
		System.out.println("Person added");
		session.close();
		sf1.close();
	}
}
