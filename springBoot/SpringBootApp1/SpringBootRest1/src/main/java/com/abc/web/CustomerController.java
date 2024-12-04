package com.abc.web;

import com.abc.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@RestController
public class CustomerController {

    //    @RequestMapping("/")
    @GetMapping("/")
    public String hello() {
        return "<h1>Hello world</h1>";
    }

    static List<Customer> customerList;

    static {
        customerList = new ArrayList<>();
        customerList.add(new Customer(10001, "ram kumar", LocalDate.of(1997, 11, 30)));
        customerList.add(new Customer(10002, "shyam kumar", LocalDate.of(1998, 12, 1)));
        customerList.add(new Customer(10003, "amit kumar", LocalDate.of(19979, 1, 12)));
        customerList.add(new Customer(10004, "sumit kumar", LocalDate.of(1991, 6, 3)));
        customerList.add(new Customer(10005, "vijay kumar", LocalDate.of(1992, 7, 5)));
        customerList.add(new Customer(10006, "ajay kumar", LocalDate.of(1995, 8, 23)));
        customerList.add(new Customer(10007, "rameshwar kumar", LocalDate.of(1996, 9, 24)));
    }

    @GetMapping("/allcustomer")
    public List<Customer> getAllCustomer() {
        return customerList;
    }

    @GetMapping("/allcustomer/{id}")
    public Customer searchCustomer(@PathVariable("id") int id) {
        return customerList.stream().filter(a -> a.getId() == id).findFirst().get();
    }

    @PostMapping("/allcustomer")
    public Customer addCustomer(@RequestBody Customer customer) {
        customerList.add(customer);
        return customer;
   }


}
