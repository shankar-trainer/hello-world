package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cts.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

}
