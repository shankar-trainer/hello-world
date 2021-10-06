package org.com.service;

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
	public void saveCustomer(Customer customer) throws CustomerException {
		if (dao.addCustomer(customer))
			System.out.println("Customer Added");
		else
			throw new CustomerException("Customer Already Present");
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
      if(dao.updateCustomer(customer))
    	  System.out.println("customer updated");
      else
    	  throw new CustomerException("Customer Not Found");
    	  
	}

	@Override
	public void findCustomer(Customer customer) throws CustomerException {
		Customer searchCustomer = dao.searchCustomer(customer);
		if (searchCustomer != null) {
			System.out.println("Customer Found");
			System.out.println(searchCustomer);
		} else
			throw new CustomerException("Customer Not Found");
	}

	@Override
	public void getAllCustomer() {
    
		for(Customer c:dao.showAllCustomer())
			System.out.println(c);
	}

}
