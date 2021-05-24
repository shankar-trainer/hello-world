package com.cg.web;

import java.util.List;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cg.error.CustomerException;
import com.cg.model.Customer;
import com.cg.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService service;

    static Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomer() throws CustomerException {
        try {
            if (service.getAllCustomer().size() != 0)
                return new ResponseEntity<List<Customer>>(service.getAllCustomer(), HttpStatus.OK);
        } catch (CustomerException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
        return null;
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Customer> searchCustomer(@PathVariable("id") Integer id) throws CustomerException {
        Customer customer = new Customer();
        customer.setCustomerId(id);

        try {
            if (service.searchCustomer(customer) != null)
                return new ResponseEntity<Customer>(service.searchCustomer(customer), HttpStatus.OK);
        } catch (CustomerException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
        return null;
    }

    @DeleteMapping("/delete/{id}")
    // @RequestMapping(value = "/save", method = RequestMethod.DELETE)
    public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") Integer id) throws CustomerException {
        Customer customer = new Customer();
        customer.setCustomerId(id);

        try {
            Customer c1 = service.deleteCustomer(customer);

            logger.info("delete  web   layer  called " + c1);

            if (c1 != null) {
                logger.info("customer web layer  deleted    ");

                return new ResponseEntity<Customer>(c1, HttpStatus.OK);
            }
        } catch (CustomerException e) {
            logger.info("delete  error   " + e.getMessage());
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
        return null;
    }

    // @PostMapping("/save")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) throws CustomerException {
        try {
            logger.info("save    " + customer);

            Customer c2 = service.addCustomer(customer);

            if (c2 != null) {
                logger.info("save called ");
                return new ResponseEntity<Customer>(c2, HttpStatus.OK);
            }
        } catch (CustomerException e) {
            logger.info("save error  called " + e.getMessage());

            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
        return null;
    }

}
