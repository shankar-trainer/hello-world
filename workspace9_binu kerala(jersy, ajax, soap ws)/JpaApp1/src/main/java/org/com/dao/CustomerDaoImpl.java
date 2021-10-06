package org.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.com.error.CustomerException;
import org.com.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	EntityManagerFactory entityManagerFactory;
	EntityManager entityManager;
	EntityTransaction transaction;

	public CustomerDaoImpl() {
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa1");
		entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
	}

	@Override
	public boolean addCustomer(Customer customer) {
		if (searchCustomer(customer) == null) {
			transaction.begin();
			entityManager.persist(customer);
			transaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public boolean removeCustomer(Customer customer) {
		if (searchCustomer(customer) != null) {
			Customer find = entityManager.find(Customer.class, customer.getId());
			if (find != null) {
				transaction.begin();
				entityManager.remove(find);
				transaction.commit();
				return true;
			} else {
				transaction.begin();
				entityManager.merge(customer);
				transaction.commit();
				return false;
			}
		}
		return false;
	}

	@Override
	public Customer searchCustomer(Customer customer) {
		return entityManager.find(Customer.class, customer.getId());
	}

	@Override
	public List<Customer> showAllCustomer() {
		return entityManager.createQuery("from Customer").getResultList();
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		if (searchCustomer(customer) != null) {
			transaction.begin();
			entityManager.merge(customer);
			transaction.commit();
			return true;
		}
		return false;
	}

}
