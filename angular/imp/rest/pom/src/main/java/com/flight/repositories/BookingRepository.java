package com.flight.repositories;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.entities.Booking;

public interface BookingRepository extends JpaRepository<Booking, BigInteger> {

}
