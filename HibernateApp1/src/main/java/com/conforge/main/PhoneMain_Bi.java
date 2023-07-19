package com.conforge.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.conforge.model.onetoone_bidirectional.Person;
import com.conforge.model.onetoone_bidirectional.Phone;
import com.conforge.util.SessionFactoryUtil;

public class PhoneMain_Bi {

	public static void main(String[] args) {
		Session session = SessionFactoryUtil.getSessionFactory().openSession();
		Transaction transaction = session.getTransaction();
		
		Phone phone=new Phone();
		
		phone.setPhoneCost(5600);
		phone.setPhoneModel("samsung");
		
		Person person=new Person();
		person.setPersonName("sunil kumar");
		person.setPersonSalary(56000);
	
		phone.setPerson(person);
		//person.setPhone(phone);
		
		transaction.begin();
		
		session.save(person);
		session.save(phone);
		
		transaction.commit();
		
		System.out.println("bi directional transaction completed");
		
		
		System.out.println("\n\nperson "+person);
		System.out.println("phone "+phone);
		
		
	}
}
