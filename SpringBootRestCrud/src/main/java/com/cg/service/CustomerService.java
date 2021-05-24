package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.CustomerRepository;
import com.cg.error.CustomerException;
import com.cg.model.Customer;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository repository;

    static Logger logger = LoggerFactory.getLogger(CustomerService.class);


    public Customer addCustomer(Customer customer) throws CustomerException {
        Optional<Customer> findById = repository.findById(customer.getCustomerId());
        if (!findById.isPresent()) {
            return repository.save(customer);
        } else
            throw new CustomerException("Customer already present");
    }

    public Customer deleteCustomer(Customer customer) throws CustomerException {
        Optional<Customer> findById = repository.findById(customer.getCustomerId());
        if (findById.isPresent()) {

            Customer c1 = findById.get();
            Customer c2=new Customer();
            c2.setCustomerId(c1.getCustomerId());
            c2.setCustomerName(c1.getCustomerName());
            c2.setCustomerSalary(c1.getCustomerSalary());

            logger.info(CustomerService.class.getSimpleName() + " delete service "+c2);
            repository.delete(customer);
            logger.info(" delete customer  " + c2);

            return c2;

        } else
            throw new CustomerException("Customer is not  present");

    }

    public Customer searchCustomer(Customer customer) throws CustomerException {
        Optional<Customer> findById = repository.findById(customer.getCustomerId());
        if (findById.isPresent()) {
            return findById.get();
        } else
            throw new CustomerException("Customer not found");
    }

    public List<Customer> getAllCustomer() throws CustomerException {
        if (repository.findAll().size() == 0)
            throw new CustomerException("Customer List is blank");
        else {
            System.out.println("service getall called ");
            return repository.findAll();
        }
    }

}
