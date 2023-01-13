package com.tvscredit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tvscredit.model.Customer;

@Repository
public interface CustomerDao  extends JpaRepository<Customer, Integer> {

}
