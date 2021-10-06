package com.flight.dao;
 
import java.math.BigInteger;
import java.util.List;
 
import com.flight.entities.Flight;
 
public interface FlightDao {
 
	public Flight addFlight(Flight flight);
	public List<Flight> viewAllFlight();
	public Flight viewFlight(BigInteger flightNumber);
	public Flight modifyFlight(Flight flight);
	public void removeFlight(BigInteger flightNumber); 
 
 
}