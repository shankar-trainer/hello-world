package com.coforge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.coforge.model.Employee;
import com.coforge.util.MySessionFactory;

public class EmployeeDao {

	SessionFactory factory;
	Transaction transaction;
	Session session;

	public EmployeeDao() {
		factory = MySessionFactory.getSessionFactory();
		session = factory.openSession();
	}

	public List<Employee> getAllEmployee() {
		List<Employee> resultList = session.createQuery("from Employee").getResultList();
		return resultList;
	}

	public List<Employee> getAllEmployee1() {
		List<Employee> resultList = session.createNamedQuery("allemp").getResultList();
		return resultList;
	}

	public Employee searchEmployee(int id) {
		Employee employee = session.get(Employee.class, id);
		System.out.println(" method "+employee);
		return employee;
	}
	
	public boolean deleteEmployee(int id) {
//		Employee employee = session.load(Employee.class, id);
		Employee employee = session.get(Employee.class, id);
		System.out.println(employee);
		if(employee!=null)
		{
			transaction = session.getTransaction();
			transaction.begin();
			session.delete(employee);
			transaction.commit();
			return true;
		}
		return false;
	}

	public boolean addEmployee(Employee emp) {
		Employee employee = session.find(Employee.class, emp.getId());
		if (employee == null) {
			transaction = session.getTransaction();
			transaction.begin();
			session.save(emp);
			transaction.commit();
			return true;
		}
		return false;
	}
	public boolean updateEmployee(Employee emp) {
		Employee employee = session.find(Employee.class, emp.getId());
		if (employee != null) {
			transaction = session.getTransaction();
			transaction.begin();
			session.merge(emp);
			transaction.commit();
			return true;
		}
		return false;
	}

}
