package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Booking;
import com.cg.entity.Seat;

@Repository
public interface BookingDao extends JpaRepository<Booking,Integer>{

	double save(double totalCost);

	boolean exists(String paymentMethod);
	
}
