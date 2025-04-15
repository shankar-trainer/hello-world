package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;
import com.example.service.CustomerService;

@RestController
@RequestMapping("/")
public class CustomerController {
    @Autowired
     CustomerService customerService;
//	
//    @GetMapping("/customer")
//	public List<Customer> getAllEmployee(){
//		return customerService.findAll();
//		
//	}
//	  @PostMapping("/customer")
//		public Customer addEmployee( @RequestBody Customer customer) {
//			return repository.save(customer);
//		}
// 
   @PostMapping("/customer")
   public ResponseEntity<Customer> registerCustomer(@RequestBody Customer customer) {
       System.out.println(customer+" at controller");
        Customer registeredCustomer = customerService.registerCustomer(customer);
       return new ResponseEntity<>(registeredCustomer, HttpStatus.CREATED);
   }
 
    @GetMapping("/{email}")
    public ResponseEntity<Customer> getCustomerByEmail(@PathVariable String email) {
        Optional<Customer> customer = customerService.getCustomerByEmail(email);
        return customer.map(ResponseEntity::ok).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
 
    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }
 
    @DeleteMapping("/{customerID}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable int customerID) {
        customerService.deleteCustomer(customerID);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/{customerID}/orders")
    public ResponseEntity<Customer> getCustomerWithOrders(@PathVariable int customerID) {
        Optional<Customer> customer = customerService.getCustomerWithOrders(customerID);
        return customer.map(ResponseEntity::ok).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}