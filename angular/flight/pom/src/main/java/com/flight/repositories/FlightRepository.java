package com.flight.repositories;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.entities.Flight;

public interface FlightRepository  extends JpaRepository<Flight, BigInteger> {

}
