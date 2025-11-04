package com.cts.controller;

import com.cts.exception.CustomerException;
import com.cts.model.Address;
import com.cts.model.Car;
import com.cts.model.Customer;
import com.cts.service.CustomerService;
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
    private CustomerService customerService;

    @GetMapping("/customer")
    public List<Customer> getAll() {
        return customerService.getAll();
    }

    @PostMapping("/car")
    public Car addCar(@RequestBody Car car) {
       return customerService.addCar(car) ;
    }

    @GetMapping("/car")
    public List<Car> getAllCar() {
     return  customerService.getAllCar();
    }


    @PostMapping("/address")
    public Address addAddress(@RequestBody  Address address) {
       return customerService.addAddress(address) ;
    }

    @GetMapping("/address")
    public List<Address> getAllAddress() {
        return  customerService.getAllAddress();
    }

    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @PutMapping("/customer")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @GetMapping("/customer/{id}")
//    public Customer searchCustomerById(@PathVariable Integer id) {
    public ResponseEntity<Customer> searchCustomerById(@PathVariable Integer id) {
        try {
            return new ResponseEntity<Customer>( customerService.searchCustomerById(id), HttpStatus.OK);
        }
        catch (CustomerException e){
            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/customer/{id}")
    public ResponseEntity<Customer> deleteCustomerByid(@PathVariable("id") int id1) {
        try {
            return  new ResponseEntity<>(customerService.deleteCustomerById(id1), HttpStatus.OK);
        }
        catch (CustomerException e){
            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

}
