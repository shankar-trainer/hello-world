package org.com.dao;


import java.util.List;

import org.com.dto.Customer;

public interface CustomerDao {

	Customer addCustomer(Customer customer);
	Customer removeCustomer(int id);
	Customer searchCustomer(int id);
	List<Customer> showAllCustomer();
	Customer updateCustomer(Customer customer) ;

}
