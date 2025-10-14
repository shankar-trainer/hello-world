package com.cts.service;

import com.cts.dao.AddressRepository;
import com.cts.dao.CarRepository;
import com.cts.dao.CustomerRepository;
import com.cts.exception.CustomerException;
import com.cts.model.Address;
import com.cts.model.Car;
import com.cts.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository repository;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    private CarRepository carRepository;

    public Car addCar(Car car){
        return    carRepository.save(car);
    }

    public List<Car> getAllCar(){
        return    carRepository.findAll();
    }

    public List<Customer> getAll() {
        return repository.findAll();
    }

    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }


    public Address addAddress(Address address) {
        Customer customer = address.getCustomer();
        customer.setAddress(address);

        return addressRepository.save(address);
    }


    public Customer addCustomer(Customer customer) {
        for(Car c:customer.getCarSet())
            c.setCustomer(customer);

        return repository.save(customer);
    }

    public Customer updateCustomer(Customer customer) {
        return repository.save(customer);
    }

    public Customer searchCustomerById(Integer id) throws CustomerException {
//        return repository.findById(id).get();
        if (repository.findById(id).isEmpty()) {
            throw new CustomerException("id not found");
        } else
            return repository.findById(id).get();

    }

    public Customer deleteCustomerById(Integer id) throws CustomerException {
        Customer c;
        if (repository.findById(id).isEmpty()) {
            throw new CustomerException("id not found");
        } else {
            c = repository.findById(id).get();
            repository.deleteById(id);
        }
        return c;
    }
}
