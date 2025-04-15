package com.coforge.main.one_to_one;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.coforge.model.one_to_one.Address;
import com.coforge.model.one_to_one.Car;
import com.coforge.model.one_to_one.Employee;
import com.coforge.util.SessionFactoryUtil;

public class One_To_One_Main2 {

	public static void main(String[] args) {

		SessionFactory factory=SessionFactoryUtil.getSessionFactory();
		Session session=factory.openSession();
		
		Employee employee=new Employee();

		 employee.setId(6);
		
		session.getTransaction().begin();
        
		// due to cascade operation no need to save dependent entity address and car set
		//session.save(address);
		
		Address address=new Address();
		address.setAddr_id(employee.getId());
		employee.setAddress(address);
		
		
		session.delete(employee);
		session.getTransaction().commit();
		
	}
}
