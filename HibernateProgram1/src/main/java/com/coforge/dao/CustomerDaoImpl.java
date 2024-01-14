package com.coforge.dao;

import java.util.List;

import javax.persistence.NamedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.model.Customer;
 
public class CustomerDaoImpl implements CustomerDao {

	Configuration configuration;
	SessionFactory factory;
	Session session;
	Transaction transaction;

	public CustomerDaoImpl() {
		configuration = new Configuration().configure();
		factory = configuration.buildSessionFactory();
		session = factory.openSession();
		transaction = session.getTransaction();
	}

	public Customer addCustomer(Customer c) {
		Customer c1 = searchCustomer(c.getCustomerId());
		if (c1 == null) {
			transaction.begin();
			session.save(c);
			transaction.commit();
			return c;
		}
		return null;
	}

	public Customer searchCustomer(int id) {
		Customer customer = session.get(Customer.class, id);
		return customer;
	}

	public List<Customer> getAllCustomer() {
		 return session.createNamedQuery("all").getResultList();
		
		 //return session.createQuery("from Customer").getResultList();
	}

	@Override
	public Customer deleteCustomer(int id) {
		Customer c1 = searchCustomer(id);
		if (c1 != null) {
			transaction.begin();
			session.delete(c1);
			transaction.commit();
			return c1;
		}
		return null;
	}

	@Override
	public Customer updateCustomer(Customer c) {
		
		Customer c1 = searchCustomer(c.getCustomerId());
		if (c1 != null) {
			transaction.begin();
		 
			session.merge(c);
			transaction.commit();
			return c;
		}
		return null;
	}

}
