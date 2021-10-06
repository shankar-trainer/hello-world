package com.flight.repositories;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.entities.ScheduledFlight;

public interface ScheduledFlightRepository extends JpaRepository<ScheduledFlight, BigInteger> {

}
