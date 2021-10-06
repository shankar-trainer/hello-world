package org.com.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDao {

	SessionFactory sf;
	Configuration cfg;
	Session session;
	Query query;
	Transaction tr;

	List<Employee> emplist;

	public EmployeeDao() {
		cfg = new Configuration();
		cfg.configure();
		sf = cfg.buildSessionFactory();
	}

	public List<Employee> showAllEmployee() {
		session = null;
		session = sf.openSession();
		query = session.createQuery("from Employee");
		emplist = query.list();
		return emplist;
	}

}
