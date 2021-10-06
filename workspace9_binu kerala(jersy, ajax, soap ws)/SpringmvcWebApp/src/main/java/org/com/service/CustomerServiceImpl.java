package org.com.service;

import java.util.List;

import org.com.dao.CustomerDao;
import org.com.dto.Customer;
import org.com.exception.CustomerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao dao;

	@Override
	public boolean saveCustomer(Customer customer) throws CustomerException {
		if (dao.addCustomer(customer))
		return true;
		else{
				
			throw new CustomerException("Customer Already Present");
		}

	}

	@Override
	public void deleteCustomer(Customer customer) throws CustomerException {
		if (dao.removeCustomer(customer))
			System.out.println("Customer Removed");
		else
			throw new CustomerException("Customer Not  Present");
	}

	@Override
	public void changeCustomer(Customer customer) throws CustomerException {
		dao.updateCustomer(customer);
		
	}

	@Override
	public Customer findCustomer(Customer customer) throws CustomerException {
		Customer searchCustomer = dao.searchCustomer(customer);
		if (searchCustomer != null) {
			return searchCustomer;
		} else
			throw new CustomerException("Customer Not Found");
	}

	@Override
	public List<Customer> getAllCustomer() {
		return dao.showAllCustomer();
	}

}