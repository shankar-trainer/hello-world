package org.audintel.dao;

import java.util.List;

import org.audintel.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

public class EmployeeDao {

	private SessionFactory factory;

	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	public List<Employee> getAllEmployee(){
		Session session = factory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		List<Employee> list1=      factory.openSession().createCriteria(Employee.class).list();
    transaction.commit();
    return list1; 
	}

}
