package com.ukg.web;

import com.ukg.exception.CustomerException;
import com.ukg.model.Customer;
import com.ukg.model.Product;
import com.ukg.repository.CustomerRepository;
import com.ukg.repository.ProductRepository;
import com.ukg.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService service;


    @RequestMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomer() {
        try {
            return new ResponseEntity<List<Customer>>(service.getAllCustomer(), HttpStatus.OK);
        } catch (CustomerException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    //@RequestMapping(value = "/add", method = RequestMethod.POST)
    @PostMapping("/add")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        try {
            return new ResponseEntity<Customer>(service.addCustomer(customer), HttpStatus.CREATED);
        } catch (CustomerException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
        try {
            return new ResponseEntity<Customer>(service.updateCustomer(customer), HttpStatus.CREATED);
        } catch (CustomerException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Customer> findCustomerById(@PathVariable("id") long id) {
        try {
            return new ResponseEntity<Customer>(service.findCustomerById(id), HttpStatus.FOUND);
        } catch (CustomerException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    //http://localhost:9090/get/1
    @GetMapping("/getbyname/")
    public ResponseEntity<Customer> findCustomerByName(@RequestParam("name") String name) {
        return new ResponseEntity<Customer>(service.findCustomerByName(name), HttpStatus.FOUND);
    }

    //http://localhost:9090/getbyname/?name=amit kumar
    @GetMapping("/getbynameandssn/")
    public ResponseEntity<Customer> findCustomerByNameAndSsn(@RequestParam("name") String name, @RequestParam("ssn") String ssn) {
        try {
            return new ResponseEntity<Customer>(service.findCustomerByNameAndSsn(name, ssn), HttpStatus.FOUND);
        } catch (CustomerException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
    // http://localhost:9090/getbynameandssn/?name=amit kumar&ssn=abc344343

    @DeleteMapping("/deletebyid/{id}")
    public ResponseEntity<Customer> deleteCustomerById(@PathVariable("id") long id) {

        try {
        return new ResponseEntity<Customer>(    service.deleteCustomerById(id), HttpStatus.FOUND);
        }
        catch (CustomerException e){
            return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
}
