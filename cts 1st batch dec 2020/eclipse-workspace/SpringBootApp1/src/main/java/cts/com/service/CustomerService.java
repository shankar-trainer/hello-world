package cts.com.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cts.com.dao.CustomerDao;
import cts.com.exception.CustomerException;
import cts.com.model.Customer;

@Service
public class CustomerService {

	Logger logger = LoggerFactory.getLogger(CustomerService.class);

	@Autowired
	CustomerDao customerDao;

	public boolean saveCustomr(Customer customer) throws CustomerException {
		logger.info("save customer starts ");
		if (customerDao.addCustomr(customer) == false) {
			logger.info("customer already present");
			throw new CustomerException("customer already present");
		} else
			logger.info("Record added");
		return true;
	}

	public Customer findCustomr(Customer customer) throws CustomerException {
		if (customerDao.searchCustomr(customer) == null) {
			logger.info("customer not  present");

			throw new CustomerException("customer not  present");
		} else
			logger.info("Record found " + customerDao.searchCustomr(customer));
		return customerDao.searchCustomr(customer);
	}

	public List<Customer> showAllCustomer() throws CustomerException {
		if (customerDao.getAllCustomr().isEmpty())
			throw new CustomerException("No record present");
		else {
			logger.info("\n\tAll Customer Information \n\t");
			for (Customer cst : customerDao.getAllCustomr()) {
				logger.info("\t" + cst);
			}
			return customerDao.getAllCustomr();
		}
	}

}
