package com.flight.service;

import java.math.BigInteger;
import java.util.List;

import com.flight.entities.Flight;

public interface FlightService {
	
	public Flight addFlight(Flight flight);
	public List<Flight> viewAllFlight();
	public Flight viewFlight(BigInteger flightNumber);
	public Flight modifyFlight(Flight flight);
	public void deleteFlight(BigInteger flightNumber);
	public boolean validateFlight(Flight flight);

}
