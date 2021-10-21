package org.com.webservice;

import java.sql.SQLException;
import java.util.List;

import javax.jws.WebService;

import org.com.webservice.exception.CustomerException;
import org.com.webservice.model.Customer;

@WebService
public interface CustomerWebService {
    public List<Customer> getAllCustomer();
	public Customer SearchCustomer(int id) throws CustomerException;
	
}
