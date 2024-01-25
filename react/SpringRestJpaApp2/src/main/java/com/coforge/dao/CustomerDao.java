package com.coforge.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coforge.model.Customer;

@Repository
public interface CustomerDao  extends JpaRepository<Customer, Long>{

	
}
