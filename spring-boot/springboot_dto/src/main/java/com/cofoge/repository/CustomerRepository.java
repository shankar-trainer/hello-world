package com.cofoge.repository;

import com.cofoge.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository
        <Customer,Integer> {
}

