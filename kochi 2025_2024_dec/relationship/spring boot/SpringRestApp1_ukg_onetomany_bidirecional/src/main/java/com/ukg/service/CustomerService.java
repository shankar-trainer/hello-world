package com.ukg.service;

import com.ukg.exception.CustomerException;
import com.ukg.model.Customer;
import com.ukg.model.Product;
import com.ukg.repository.CustomerRepository;
import com.ukg.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;
    @Autowired
    private ProductRepository productRepository;

    public List<Customer> getAllCustomer() {
        if (repository.findAll().size() == 0)
            throw new CustomerException("list is empty");
        return repository.findAll();
    }

//    @Transactional
    public Customer addCustomer(Customer customer) {
        if (repository.findById(customer.getId()).isPresent())
            throw new CustomerException("id already present");
        else {
//            for (Product p : customer.getProductSet())
//                productRepository.save(p);

            return repository.save(customer);
        }
    }

    public Customer updateCustomer(Customer customer) {

        if (repository.findById(customer.getId()).isEmpty())
            throw new CustomerException("id not present");
        else {
//            for (Product p : customer.getProductSet())
//                productRepository.save(p);
            return repository.save(customer);
        }
    }

    public Customer findCustomerById(long id) {
        Optional<Customer> byId = repository.findById(id);
        if (byId.isPresent())
            return byId.get();
        else
            throw new CustomerException("id not found");
    }

    public Customer findCustomerByName(String name) {
        if (repository.findByName(name) == null)
            throw new CustomerException("name not found");
        else
            return repository.findByName(name);
    }

    public Customer findCustomerByNameAndSsn(String name,String ssn) {
        if(repository.findByNameAndSsn(name, ssn)==null)
            throw new CustomerException("name and ssn not found");
        return repository.findByNameAndSsn(name, ssn);
    }

    public Customer deleteCustomerById( long id) {

        if (repository.findById(id).isPresent()) {
            Customer c = repository.findById(id).get();
            repository.deleteById(id);
            return c;
        }
        else
            throw new CustomerException("id not present");
    }
}
