package com.flight.dao;

import java.math.BigInteger;
import java.util.List;

import com.flight.entities.Airport;
import com.flight.entities.Flight;
import com.flight.entities.Schedule;
import com.flight.entities.ScheduledFlight;

public interface ScheduledFlightDao {

	public ScheduledFlight scheduleFlight(ScheduledFlight scheduleFlight);
	public List<Flight> viewScheduledFlights(Airport srcAirport, Airport destAirport, String date);
	public List<ScheduledFlight> viewScheduledFlightsByFlightNumber(BigInteger flightNumber);
	public List<ScheduledFlight> viewAllScheduledFlights();
	public ScheduledFlight modifyScheduledFlight(Flight flight, Schedule schedule, int availableSeats);
	public void deleteScheduledFlight(BigInteger id);

}
