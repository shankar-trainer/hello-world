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
	
	public boolean removeEmploye(Employee employee) {
		if (empSearch(employee) != null)		{
			session = null;
			session = sf.openSession();
			tr = session.getTransaction();
			tr.begin();
			session.delete(employee);
			tr.commit();
			return true;
		}
		else 
			return false;
	}

	public boolean addEmploye(Employee employee) {
		if (empSearch(employee) != null)
			return false;
		else {
			session = null;
			session = sf.openSession();
			tr = session.getTransaction();

			tr.begin();
			session.save(employee);
			tr.commit();
			return true;
		}
	}

	public List<Employee> showAllEmployee() {
		session = null;
		session = sf.openSession();
		query = session.createQuery("from Employee");
		emplist = query.list();
		return emplist;
	}

	Employee emp1 = null;

	
	public Employee empSearch(Employee emp) {
		session = null;
		session = sf.openSession();
		emp1 = null;
		emp1 = session.get(Employee.class, emp.getEmp_id());
		return emp1;
	}
}
