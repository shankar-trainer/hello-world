package com.flight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.dao.AirportDao;
import com.flight.entities.Airport;
import com.flight.exceptions.RecordAlreadyPresentException;
import com.flight.exceptions.RecordNotFoundException;


@Service
public class AirportServiceImpl implements AirportService {
	
	@Autowired
	AirportDao airportDao;

	/**
	This method is used to add Airport
	@Airport airport This is the parameter passed to get the Airport object 
	@return  This returns the object of Airport generated
	 * @throws AirportAlreadyExistException 
	*/
	public Airport addAirport(Airport airport) throws RecordAlreadyPresentException {
		
		return airportDao.addAirport(airport);
	}

	/**
	This method is used to delete Airport
	@String id This is the parameter passed to get the id 
	 * @throws ResourceNotFoundException
	*/
	public void deleteAirportById(String id) throws RecordNotFoundException {
		
		airportDao.deleteAirportById(id);

	}

	/**
	 * This method is used to get all Airports
	 * @return  returns all the Airports
	 */
	public List<Airport> getAllAirports() {
		
		return airportDao.getAllAirports();
	}

}
