package com.cts.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.dao.AddressRepository;
import com.cts.dao.CarRepository;
import com.cts.dao.CustomerRepository;
import com.cts.model.Car;
import com.cts.model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	AddressRepository addressRepository;

	@Autowired
	CarRepository carRepository;
	
	
	@GetMapping("/all")
	public  List<Customer> getAllCustomer(){
	   return  customerRepository.findAll();
	}
	
	
	@PostMapping("/addCustomerAddress")
	public Customer addCustomer1(@RequestBody Customer customer){
	   addressRepository.save(customer.getAddress());
    return 	customerRepository.save(customer);
	}
	
	@PostMapping("/addCustomerCar")
	public Customer addCustomer2(@RequestBody Customer customer){
	
		addressRepository.save(customer.getAddress());
	    
		for(Car car:customer.getCarSet()) {
			carRepository.save(car);
		}
		
		return 	customerRepository.save(customer);
	}
	
}
