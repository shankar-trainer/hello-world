package com.coforge.web;

import com.coforge.error.CustomerException;
import com.coforge.model.Customer;
import com.coforge.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping("/customer")
    public ResponseEntity<?> addCustomer(@RequestBody Customer customer) throws CustomerException {
        try {
            return new ResponseEntity<>(service.addCustomer(customer), HttpStatus.CREATED);
        } catch (CustomerException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.FOUND);
        }
    }

    @PutMapping("/customer")
    public ResponseEntity<?> updateCustomer(@RequestBody Customer customer) throws CustomerException {
        try {
            return new ResponseEntity<>(service.updateCustomer(customer), HttpStatus.CREATED);
        } catch (CustomerException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.FOUND);
        }
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<?> searchCustomer(@PathVariable("id") long id) throws CustomerException {
        try {
            return new ResponseEntity<>(service.searchCustomer(id), HttpStatus.FOUND);
        } catch (CustomerException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/customer/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable("id")  long id) throws CustomerException {
        try {
            return new ResponseEntity<>(service.deleteCustomer(id), HttpStatus.OK);
        } catch (CustomerException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/customer")
    public ResponseEntity<List<?>> getAllCustomer() throws CustomerException {
        try {
            return new ResponseEntity<>(service.getAllCustomer(), HttpStatus.FOUND);
        } catch (CustomerException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
