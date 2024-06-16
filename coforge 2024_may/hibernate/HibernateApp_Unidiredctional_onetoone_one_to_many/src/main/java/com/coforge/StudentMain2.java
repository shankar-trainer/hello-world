package com.coforge;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.coforge.model.Address;
import com.coforge.model.Student;
import com.coforge.util.MySessionFactory;

public class StudentMain2 {

	public static void main(String[] args) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
 
		Session session = factory.openSession();
		Student student = session.find(Student.class, 1);

		Transaction transaction = session.getTransaction();

		transaction.begin();
		
		session.delete(student);
		transaction.commit();
 
		session.close();

	}
}
