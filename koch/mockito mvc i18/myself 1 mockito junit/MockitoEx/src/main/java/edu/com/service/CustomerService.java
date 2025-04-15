package edu.com.service;

import edu.com.dao.CustomerDao;
import edu.com.entity.Customer;

import java.util.UUID;

public class CustomerService {
	private CustomerDao dao;
	
	public void register(Customer customer){
		customer.setToken(generateToken());
		dao.save(customer);
	}

	private String generateToken() {
		return UUID.randomUUID().toString();
	}

	public Customer addCustomer(Customer customer) {
		try{
			return dao.save(customer);
		}catch (Exception e) {
		}
		return null;
	}

	public Customer changeEmail(String oldEmail, String newEmail) {
		Customer customer = new Customer();
		dao.updateEmail(customer , newEmail);
		return customer;
	}
}
