package com.flight.repositories;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, BigInteger> {

}
