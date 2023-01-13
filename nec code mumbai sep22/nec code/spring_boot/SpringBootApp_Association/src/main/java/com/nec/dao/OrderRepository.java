package com.nec.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nec.model.Order;

@Repository
public interface OrderRepository  extends JpaRepository<Order, Integer> {

}
