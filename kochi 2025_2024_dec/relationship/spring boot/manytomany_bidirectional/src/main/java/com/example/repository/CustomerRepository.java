package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Optional<Customer> findByEmail(String email);
 
    @Query("SELECT c FROM Customer c LEFT JOIN FETCH c.orders WHERE c.customerID = :customerID")
    Optional<Customer> findByIdWithOrders(@Param("customerID") int customerID);
}