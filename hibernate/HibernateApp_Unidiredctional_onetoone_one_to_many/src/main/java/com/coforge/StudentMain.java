package com.coforge;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.coforge.model.Address;
import com.coforge.model.Friend;
import com.coforge.model.Student;
import com.coforge.util.MySessionFactory;

public class StudentMain {

	public static void main(String[] args) {
		String friendName[]= {"kamal kumar","vimal kumar","parkash kumar","suman kumar"};
		int friendAge[]= {22,23,21,20};
		
		SessionFactory factory = MySessionFactory.getSessionFactory();

		Student student = new Student();
		Address address = new Address();
	
		Friend friend[]=new Friend[4];
		Set<Friend> set1=new HashSet<>();
		
		for (int i = 0; i < friend.length; i++) {
			friend[i]=new Friend();
			friend[i].setName(friendName[i]);
			friend[i].setAge(friendAge[i]);
			set1.add(friend[i]);
		}
		
		address.setLocation("sector1");
		address.setCity("gr noida");

		student.setName("anand kumar");
		student.setSubject("Math");

		student.setAddress(address);
		student.setFriendSet(set1);

		Session session = factory.openSession();

		Transaction transaction = session.getTransaction();

		transaction.begin();

		// cascade will save address object

//		session.persist(student);
		session.save(student);

		// session.save(address);

		transaction.commit();

		//List<Student> resultList = session.createQuery("from Student").getResultList();
		 List<Student> resultList = session.createQuery("from Student",Student.class).getResultList();


		for (Student student2 : resultList) {
			System.out.println(student2);
		}
		session.close();


	}
}
