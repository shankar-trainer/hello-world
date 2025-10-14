package com.cts.controller;

import com.cts.model.Customer;
import com.cts.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/")
@CrossOrigin("http://localhost:4200")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer")
//    public List<Customer> getAll() {
//        return customerService.getAll();
//    }

    public CollectionModel<EntityModel<Customer>> getAll() {
        List<EntityModel<com.cts.model.Customer>> customers = customerService.getAll().stream()
                .map(customer -> EntityModel.of(customer,
                        linkTo(methodOn(CustomerController.class).searchCustomerById(customer.getId())).withSelfRel()
                ))
                .collect(Collectors.toList());

        return CollectionModel.of(customers, linkTo(methodOn(CustomerController.class).getAll()).withSelfRel());
    }

    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @PutMapping("/customer")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }

//    @GetMapping("/customer/{id}")
//    public Customer searchCustomerById(@PathVariable Integer id) {
//        return customerService.searchCustomerById(id);
//    }

    @GetMapping("/customer/{id}")
    public EntityModel<Customer> searchCustomerById(@PathVariable Integer id) {
        var customer = customerService.searchCustomerById(id);
        return EntityModel.of(customer,
//                linkTo(methodOn(CustomerController.class).searchCustomerById(id)).withSelfRel());
                linkTo(methodOn(CustomerController.class).searchCustomerById(id)).withSelfRel(),
                linkTo(methodOn(CustomerController.class).getAll()).withRel("customers"));

    }

    @DeleteMapping("/customer/{id}")
    public Customer deleteCustomerByid(@PathVariable("id") int id1) {
        return customerService.deleteCustomerById(id1);
    }

}
