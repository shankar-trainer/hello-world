package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
