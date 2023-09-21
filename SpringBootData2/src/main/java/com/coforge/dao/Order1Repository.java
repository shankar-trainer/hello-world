package com.coforge.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coforge.model.Order1;

@Repository
public interface Order1Repository extends JpaRepository<Order1, Long>{

}
