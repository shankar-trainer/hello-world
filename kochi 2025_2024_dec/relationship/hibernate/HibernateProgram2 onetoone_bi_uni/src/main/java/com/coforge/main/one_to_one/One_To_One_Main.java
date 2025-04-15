package com.coforge.main.one_to_one;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.coforge.model.one_to_one.Address;
import com.coforge.model.one_to_one.Car;
import com.coforge.model.one_to_one.Employee;
import com.coforge.util.SessionFactoryUtil;

public class One_To_One_Main {

	public static void main(String[] args) {

		SessionFactory factory=SessionFactoryUtil.getSessionFactory();
		Session session=factory.openSession();
		
		Employee employee=new Employee();
		Address address=new Address();
		
		Set<Car> carset=new HashSet<>();
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		
		c1.setCar_Model("maruti suzuki");
		c1.setCar_Cost(600000);
		
		c2.setCar_Model("maruti alto");
		c2.setCar_Cost(400000);
		
		c3.setCar_Model("mahindra scorpio");
		c3.setCar_Cost(1500000);
			
		carset.add(c1);carset.add(c2);carset.add(c3);

		employee.setName("arvind kumar");
		employee.setSalary(35000);
		
		address.setAddr_City("greater noida");
		address.setAddr_State("Uttar Pardesh");
		address.setPin(67676767);

		employee.setAddress(address);
		employee.setCarSet(carset);
		
		session.getTransaction().begin();
        
		// due to cascade operation no need to save dependent entity address and car set
		//session.save(address);
		session.save(employee);
		session.getTransaction().commit();
		
	}
}
