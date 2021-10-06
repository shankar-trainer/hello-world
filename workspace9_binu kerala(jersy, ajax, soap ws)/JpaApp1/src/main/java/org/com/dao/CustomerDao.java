package org.com.dao;

import java.util.List;

import org.com.error.CustomerException;
import org.com.model.Customer;

public interface CustomerDao {

	boolean addCustomer(Customer customer);

	boolean removeCustomer(Customer customer);

	Customer searchCustomer(Customer customer);

	List<Customer> showAllCustomer();

	boolean updateCustomer(Customer customer) ;

}
