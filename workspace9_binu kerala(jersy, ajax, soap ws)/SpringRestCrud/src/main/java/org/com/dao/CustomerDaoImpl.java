package org.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.com.dto.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	@Transactional
	public Customer addCustomer(Customer customer) {
		Customer cst2 = entityManager.find(Customer.class, customer.getId());
		if (cst2 == null)
			entityManager.persist(customer);
		return customer;
	}

	@Transactional
	@Override
	public Customer removeCustomer(int id) {
		Customer cst1 = entityManager.find(Customer.class, id);
		
		entityManager.remove(cst1);
		return cst1;
	}

	@Override
	public Customer searchCustomer(int id) {
		return entityManager.find(Customer.class, id);
	}

	@Override
	public List<Customer> showAllCustomer() {
		return entityManager.createQuery("from Customer").getResultList();
	}

	@Transactional
	@Override
	public Customer updateCustomer(Customer customer) {
		return entityManager.merge(customer);
	}

}
