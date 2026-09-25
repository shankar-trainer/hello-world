package com.cts.repository;

import com.cts.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends
        JpaRepository<Customer,Integer> {
}
