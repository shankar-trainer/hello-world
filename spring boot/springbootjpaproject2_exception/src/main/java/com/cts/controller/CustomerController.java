package com.cts.controller;

import com.cts.dao.CustomerRepository;
import com.cts.error.ResourceNotFoundException;
import com.cts.exception.CustomerException;
import com.cts.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("http://localhost:4200")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customer")
    public ResponseEntity<List<Customer>> getAll() {

        if (customerRepository.findAll().isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
             throw new ResourceNotFoundException("list  is empty");
        } else
            return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);

    }

    @PostMapping("/customer")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        return  new ResponseEntity<Customer>(customerRepository.save(customer), HttpStatus.FOUND);
    }

    @PutMapping("/customer")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
        Customer c = customerRepository.findById(customer.getId()).orElseThrow(() -> new ResourceNotFoundException("no customer found with id " +customer.getId()));
        return new ResponseEntity<>(customerRepository.save(customer), HttpStatus.FOUND);

    }

    @GetMapping("/customer/{id}")
//    public Customer searchCustomerById(@PathVariable Integer id) {
    public ResponseEntity<Customer> searchCustomerById(@PathVariable Integer id) {

        Customer c = customerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("no customer found with id " + id));
        return new ResponseEntity<>(c, HttpStatus.OK);
    }

    @DeleteMapping("/customer/{id}")
    public ResponseEntity<Customer> deleteCustomerByid(@PathVariable("id") int id) {
        Customer c = customerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("no customer found with id " + id));
        customerRepository.deleteById(id);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }

}
