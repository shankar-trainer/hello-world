package com.example.repository;


import com.example.model.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductOrderRepository  extends JpaRepository<ProductOrder, Integer> {

}
