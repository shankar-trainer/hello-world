package com.flight.service;

import java.util.List;

import com.flight.entities.Airport;
import com.flight.exceptions.RecordAlreadyPresentException;
import com.flight.exceptions.RecordNotFoundException;

public interface AirportService {

	public Airport addAirport(Airport airport) throws RecordAlreadyPresentException;
	public void deleteAirportById(String id) throws RecordNotFoundException;
	public List<Airport> getAllAirports();
}
