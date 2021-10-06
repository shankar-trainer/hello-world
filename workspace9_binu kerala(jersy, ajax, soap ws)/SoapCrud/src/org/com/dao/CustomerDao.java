package org.com.dao;


import java.sql.SQLException;
import java.util.List;

import javax.jws.WebService;

import org.com.dto.Customer;

@WebService
public interface CustomerDao {

	boolean addCustomer(Customer customer) throws Exception ;
	boolean removeCustomer(Customer customer) ;
	String searchCustomer(Customer customer);
	List<Customer> showAllCustomer();
	String updateCustomer(Customer customer) ;

}
