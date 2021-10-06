package com.flight.dao;

import java.math.BigInteger;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flight.entities.Flight;
import com.flight.repositories.FlightRepository;

@Repository
public class FlightDaoImpl implements FlightDao {

Logger logger=LoggerFactory.getLogger(FlightDaoImpl.class);
	
	@Autowired
	public FlightRepository flightRep;
	

	/**
	 * This function is used to add Flight object to flight database
	 * 
	 * @author Garima
	 * @param Flight object to be added
	 * @return Flight object added
	 * @version 1.0
	 * @since 29-10-2020
	 */
	@Override
	public Flight addFlight(Flight flight) {
		logger.info("add Flight method is accessed at DAO Layer");
		return flightRep.save(flight);
	}
	
	@Override
	public List<Flight> viewAllFlight() {
		logger.info("viewAllFlight method is accessed at DAO Layer");
		return flightRep.findAll();
	}
	
	/**
	 * This function is use to view Flight corresponding to the flight number
	 * 
	 * @author Garima
	 * @param flightNumber-BigInteger
	 * @return Flight object constituting flight details from the corresponding flight number
	 * @version 1.0
	 * @since 29-10-2020
	 */

	@Override
	public Flight viewFlight(BigInteger flightNumber) {
		logger.info("view Flight method is accessed...");
		return flightRep.findById(flightNumber).get();
	}
	
	/**
	 * This function is used to modify the existing flight object
	 * 
	 * @author Garima
	 * @param Flight object to be modified
	 * @return Flight object which is modified
	 * @version 1.0
	 * @since 29-10-2020
	 */

	@Override
	public Flight modifyFlight(Flight flight) {
		logger.info("modify Flight method is accessed at DAO Layer");
		return flightRep.save(flight);
	}

	
	/**
	 * This function is used to delete flight from database
	 * 
	 * @author Garima
	 * @param Flight Number of the flight to be deleted
	 * @return output on the console that flight is deleted
	 * @version 1.0
	 * @since 29-10-2020
	 */
	@Override
	public void removeFlight(BigInteger flightNumber) {
		logger.info("remove Flight method is accessed at DAO Layer");
		flightRep.deleteById(flightNumber);
		System.out.println("Flight of flight number "+ flightNumber+" is deleted successfully");
	}
	
	
	
}
