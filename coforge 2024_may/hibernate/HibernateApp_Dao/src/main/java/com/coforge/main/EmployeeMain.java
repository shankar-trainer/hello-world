package com.coforge.main;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.query.Query;

import com.coforge.model.Employee;
import com.coforge.util.MySessionFactory;

public class EmployeeMain {

	public static void main(String[] args) {
		
//		Configuration configuration=new Configuration();
//		configuration.configure();
//		
//		SessionFactory factory=configuration.buildSessionFactory();
		
		SessionFactory factory=MySessionFactory.getSessionFactory();
		
		Session session=factory.openSession();
		
		Transaction transaction = session.getTransaction();
		
		Employee employee=new Employee();
		//employee.setId(10002);
		employee.setName("harsh chauhan");
		employee.setSalary(90000);
		employee.setDob(LocalDate.of(2001, 10, 30));
		
		transaction.begin();
		session.save(employee);
		transaction.commit();
		
		Query query = session.createQuery("from Employee");
		
		List<Employee> resultList = query.getResultList();
		
		for(Employee emp1:resultList)
			System.out.println(emp1.getId()+"\t"+emp1.getName()+"\t"+emp1.getSalary()+"\t"+emp1.getDob());
		
		
		session.close();
		
	}
}
