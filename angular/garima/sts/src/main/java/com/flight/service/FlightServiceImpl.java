package com.flight.service;

import java.math.BigInteger;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.dao.FlightDao;

import com.flight.entities.Flight;
import com.flight.exceptions.RecordAlreadyPresentException;
import com.flight.exceptions.RecordNotFoundException;
import com.flight.repositories.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {

Logger logger=LoggerFactory.getLogger(FlightServiceImpl.class);
	
	@Autowired
	private FlightDao flightDao;
	
	@Autowired
	private FlightRepository flightRep;
	
	
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
		logger.info("add flight method is accessed in service layer");
			if(validateFlight(flight)) {
				flightDao.addFlight(flight);
				return flight;
			}
			else
			{
				logger.info("Flight with Flight Number: "+ flight.getFlightNumber()+" is already present!!!");
				throw new RecordAlreadyPresentException("Flight is already present!!!");
			}
		
	}

	/**
	 * This functoin is use to view all the flights 
	 * 
	 * @author Garima
	 * @param none
	 * @return List of all the flights
	 * @version 1.0
	 * @since 29-10-2020
	 */

	@Override
	public List<Flight> viewAllFlight() {
		logger.info("view all flight method is accessed in service layer");
		return flightDao.viewAllFlight();
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
		logger.info("view flight method is accessed in service layer");
		if(flightRep.findById(flightNumber).isPresent()) {
		return flightDao.viewFlight(flightNumber);
		}
		else
		{
			throw new RecordNotFoundException("Given flight number does not exist");
		}
		
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
		logger.info("modify flight method is accessed in service layer");
			if(flightRep.findById(flight.getFlightNumber()).isPresent())
			{
				flightDao.modifyFlight(flight);
				return flight;
			}
			else {
				throw new RecordNotFoundException("Flight with number: " + flight.getFlightNumber() + " not exists");
			}
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
	public void deleteFlight(BigInteger flightNumber) {
		logger.info("delete flight method is accessed in service layer");
			if(flightRep.findById(flightNumber).isPresent()) {
				flightDao.removeFlight(flightNumber);
			}
			else
			{
				throw new RecordNotFoundException("Flight with number: " + flightNumber + " not exists");
			}
	}
	/**
	 * This function is used to validate flight details before adding them to the database
	 * 
	 * @author Garima
	 * @param Flight object to be validated
	 * @return Prints output on console that flight object is valid or not
	 * @version 1.0
	 * @since 29-10-2020
	 */
	@Override
	public boolean validateFlight(Flight flight) {
		logger.trace("validate flight method is accessed in service layer");
		List<Flight> allFlights=viewAllFlight();
		for(Flight f: allFlights)
		{
			if(f.getFlightModel().equals(flight.getFlightModel()))
			{
				return false;
			}
		}
		return true;
	}
	
	

}
