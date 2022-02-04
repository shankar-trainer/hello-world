package edu.lpu.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import edu.lpu.model.Employee;
import edu.lpu.util.HibernateUtil;

public class EmployeeDao {

	SessionFactory factory;
	Transaction tr;
	Session session;
    Query query;
	public EmployeeDao() {
		factory = HibernateUtil.SF_factory();
		session = factory.openSession();
		tr = session.getTransaction();
	}

	public boolean addEmployee(Employee emp) {
		tr.begin();
		session.save(emp);
		tr.commit();
		return true;
	}

	public List<Employee> getAllEmployee() {
    query=   session.createQuery("from Employee");
       return query.list();
	}

}
