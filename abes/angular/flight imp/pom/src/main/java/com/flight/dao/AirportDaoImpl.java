package com.flight.dao;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flight.entities.Airport;
import com.flight.exceptions.RecordAlreadyPresentException;
import com.flight.exceptions.RecordNotFoundException;
import com.flight.repositories.AirportRepository;



@Repository
public class AirportDaoImpl implements AirportDao {
	
	@Autowired
	AirportRepository airportRepo;
	
	Logger logger= LoggerFactory.getLogger(AirportDaoImpl.class);

	/**
	This method is used to add Airport
	@Airport airport This is the parameter passed to get the Airport object 
	@return  This returns the object of Airport generated
	 * @throws AirportAlreadyExistException 
	*/
	public Airport addAirport(Airport airport) throws RecordAlreadyPresentException{
		
		List<Airport> airports= getAllAirports();
		if(airports.contains(airport))
		{
			throw new RecordAlreadyPresentException("Airport with this id already exist.");
		}
		else
		{
			Airport a1=airportRepo.save(airport);
			logger.trace("Airport added");
			return a1;
		}
		
	}

	/**
	This method is used to delete Airport
	@String id This is the parameter passed to get the id 
	 * @throws ResourceNotFoundException
	*/
	public void deleteAirportById(String id) throws RecordNotFoundException {
		Optional<Airport> airport=airportRepo.findById(id);
		if(airport.isPresent())
		{
			airportRepo.delete(airport.get());
		}
		else
		{
			throw new RecordNotFoundException("No Airport is available by this id");
		}
		
	}

	/**
	 * This method is used to get all Airports
	 * @return  returns all the Airports
	 */
	public List<Airport> getAllAirports() {
		return airportRepo.findAll();
	}

}
