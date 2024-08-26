
package com.ukg.web;

import com.ukg.model.Customer;
import com.ukg.model.Order;
import com.ukg.repository.CustomerRepository;
import com.ukg.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class CustomerController {

    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/allCustomer")
    public ResponseEntity<Customer[]> getAllCustomer() {
        ResponseEntity<Customer[]> c = restTemplate.getForEntity("http://localhost:7070/all", Customer[].class);
        return c;
    }

    @GetMapping("/searchCustomerbyId/{id}")
    public ResponseEntity<Customer> searchCustomer(@PathVariable("id") long id) {
        ResponseEntity<Customer> c = restTemplate.getForEntity
                ("http://localhost:7070/get/" + id, Customer.class);
        return c;
    }
//http://localhost:6060/searchCustomerbyId/1

    @Autowired
    OrderRepository repository;

 @Autowired
    CustomerRepository crepository;
    @PostMapping("/addOrder/{id}")
    public Order addOrder(@RequestBody Order order, @PathVariable("id") long id) {
        ResponseEntity<Customer> c = restTemplate.getForEntity
                ("http://localhost:7070/get/" + id, Customer.class);

        if (c != null) {
           Customer c1= c.getBody();
            System.out.println("customer found.... "+c1);

            crepository.save(c1);
            //order.setCustomer(c1);
            return repository.save(order);
        }
        else
            return null;
    }

}
