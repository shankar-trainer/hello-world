package com.flight.AirportTest;


import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.flight.controllers.UserController;
import com.flight.entities.Airport;
import com.flight.repositories.AirportRepository;


@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest
class AirportTests {
	
	@Autowired
	UserController airportController;
	
	@Autowired
	AirportRepository airportRepo;

	/**
	 * Test to check addAirport method of controller
	 * @throws AirportAlreadyExistException 
	 */
	@Test
	@Rollback(true)
	public void test_addAirport()  {
		
		Airport airport1=new Airport("BCN", "Barcelona International Airport", "Barcelona");
		airportController.addAirport(airport1);
		
		Airport foundAirport= airportRepo.getOne(airport1.getAirportCode());
		assert foundAirport.equals(airport1);
		
	}
	
	/**
	 * Test to check deleteAirportById method of controller
	 */
	@Test
	@Rollback(true)
	public void test_deleteAirportById() {
		
		Airport airport1=new Airport("BCN", "Barcelona International Airport", "Barcelona");
		airportRepo.save(airport1);
		
		airportController.deleteAirport(airport1.getAirportCode());
		boolean checked=false;
		if(airportRepo.findById(airport1.getAirportCode()).isPresent())
		{
			checked=true;
		}
		Assert.assertEquals(false, checked);
		
	}
	
	/**
	 * Test to check getAllAirport method of controller
	 */
	@Test
	@Rollback(true)
	public void test_getAllAirports() {
		
		Airport airport1=new Airport("BCN", "Barcelona International Airport", "Barcelona");
		Airport airport2=new Airport("MCN", "Munich International Airport", "Munich");
		airportRepo.save(airport1);
		airportRepo.save(airport2);
		
		List<Airport> airportList= airportController.getAllAirports();
		assert airportList.contains(airport1);
		assert airportList.contains(airport2);
	}

}
