package com.flight.dao;

import java.util.List;

import com.flight.entities.Airport;
import com.flight.exceptions.RecordAlreadyPresentException;
import com.flight.exceptions.RecordNotFoundException;

public interface AirportDao {

	public Airport addAirport(Airport airport) throws RecordAlreadyPresentException;

	public void deleteAirportById(String id) throws RecordNotFoundException;

	public List<Airport> getAllAirports();

}
