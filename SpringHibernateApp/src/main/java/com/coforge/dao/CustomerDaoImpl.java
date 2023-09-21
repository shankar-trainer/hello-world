package com.coforge.dao;

import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.coforge.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	SessionFactory factory;

	public CustomerDaoImpl(SessionFactory sessionFactory) {
		this.factory = sessionFactory;
	}

	@Transactional
	@Override
	public Customer addCustomer(Customer cs) {
		Session session = factory.getCurrentSession();
		Customer customer = session.get(Customer.class, cs.getId());
		if (customer == null) {
			session.save(cs);
			return cs;
		}
		return null;
	}
}
