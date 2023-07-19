package com.conforge.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.conforge.model.onetoone_bidirectional.Person;
import com.conforge.model.onetoone_bidirectional.Phone;
import com.conforge.util.SessionFactoryUtil;

public class PhoneMain {

	public static void main(String[] args) {
		Session session = SessionFactoryUtil.getSessionFactory().openSession();
		Transaction transaction = session.getTransaction();

		
		Phone phone=new Phone();
		phone.setPhoneCost(5600);
		phone.setPhoneModel("samsung");
		
		Person person=new Person();
		person.setPersonName("sunil kumar");
		person.setPersonSalary(56000);
		
		person.setPhone(phone);
		
		transaction.begin();
		
		//session.save(phone);
		session.save(person);
		
		transaction.commit();
		
		System.out.println("uni directional transaction completed");
		
		
		
		System.out.println("\n\nperson "+person);
		System.out.println("phone "+phone);
		
		
	}
}
