package org.montran.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.montran.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();

		Transaction transaction = session.beginTransaction();

		Employee emp = new Employee();
		emp.setId(10002);
		emp.setName("surendrad partab ");
		emp.setSalary(17000);

		session.save(emp);

		transaction.commit();

		System.out.println("Record Added");

	}
}
