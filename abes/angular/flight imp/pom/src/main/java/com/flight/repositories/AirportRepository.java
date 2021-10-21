package com.flight.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.entities.Airport;

public interface AirportRepository extends JpaRepository<Airport, String> {

}
