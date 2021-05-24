package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.model.Customer;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Integer> {

}
