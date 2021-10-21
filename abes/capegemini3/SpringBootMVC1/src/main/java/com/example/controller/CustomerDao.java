//package com.example.dao;
package com.example.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.example.model.Customer;

@Repository
public interface CustomerDao extends  JpaRepository<Customer, Integer> {

	
	
}
