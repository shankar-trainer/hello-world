package com.coforge.main.one_to_one;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.coforge.model.one_to_one.Address;
import com.coforge.model.one_to_one.Car;
import com.coforge.model.one_to_one.Employee;
import com.coforge.model.one_to_one_bi.Bike;
import com.coforge.model.one_to_one_bi.User;
import com.coforge.util.SessionFactoryUtil;

public class One_To_One_Bi_Main {

	public static void main(String[] args) {

		SessionFactory factory = SessionFactoryUtil.getSessionFactory();
		Session session = factory.openSession();

		Transaction transaction = session.getTransaction();

		User user = new User();
		user.setUserName("suresh kumar");
		user.setUserDob(LocalDate.of(1990,11,12));

		Bike bike = new Bike();

		bike.setBikeModel("honda shine");
		bike.setBikeCost(90000);
         // uni direction  user --> bike
		user.setBike(bike);

		// bi direction  bike --> user
		bike.setUser(user);
		
		transaction.begin();
		//session.save(user);
		session.save(bike);
		transaction.commit();
		
		

	}
}
