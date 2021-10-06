package org.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.com.dto.Customer;
import org.com.dto.Customer1;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	@Transactional
	public boolean addCustomer(Customer customer) {
		Customer find = entityManager.find(Customer.class, customer.getId());
		
		//if (searchCustomer(customer) != null) {
			if (find== null) {
			entityManager.merge(customer);
			return true;
		}
		return false;
	}

	@Transactional
	@Override
	public boolean removeCustomer(Customer customer) {
		if (searchCustomer(customer) != null) {
			Customer find = entityManager.find(Customer.class, customer.getId());
			if (find != null) {
				Customer1 cust=new Customer1();
			
				cust.setId(find.getId());
				cust.setName(find.getName());
				cust.setSalary(find.getSalary());
				entityManager.persist(cust);
				entityManager.remove(find);
				return true;
			} else {
				entityManager.merge(customer);
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

	@Transactional
	@Override
	public boolean updateCustomer(Customer customer) {
		
		if (searchCustomer(customer) != null) {
			entityManager.merge(customer);
			return true;
		}
		return false;
	}

}
