package com.flight.flightTest;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import javax.transaction.Transactional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.flight.controllers.UserController;
import com.flight.entities.Flight;
import com.flight.repositories.FlightRepository;

/**
 * @author Garima
 *
 */

@SpringBootTest
@Transactional
class FlightControllerTest {
	
	@Autowired
	private UserController userController;
	
	@Autowired
	private FlightRepository fRepo;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	/**
	 * Test method for 
	 * {@link com.flight.controllers.UserController#addFlight(com.flight.entities.Flight)}.
	 * @author Garima
	 * @since 30-10-2020
	 */

	@Test
	@Rollback
	void testAddFlight() {
		Flight f1=new Flight(new BigInteger("124587"),"Indigo","ASD1234",500);
		Flight f2=userController.addFlight(f1);
		assertEquals(f1.getCarrierName(), f2.getCarrierName());
	}
	
	/**
	 * Test method for 
	 * {@link com.flight.controllers.UserController#viewFlight(java.math.BigInteger)}.
	 * @author Garima
	 * @since 30-10-2020
	 */

	@Test
	void testViewFlight() {
		Flight f1=userController.viewFlight(new BigInteger("3"));
		Flight f2=fRepo.getOne(new BigInteger("3"));
		assertEquals(f2.getCarrierName(), f1.getCarrierName());
	}

	/**
	 * Test method for
	 *  {@link com.flight.controller.UserController#modifyFlight(com.flight.entities.Flight)}.
	 *  @author Garima
	 * @since 30-10-2020
	 */
	
	@Test
	@Rollback
	void testModifyFlight() {
		Flight f1=fRepo.getOne(new BigInteger("3"));
		f1.setCarrierName("Spice Jet");
		Flight f2=userController.modifyFlight(f1);
		assertEquals(f1.getCarrierName(), f2.getCarrierName());
	}

	/**
	 * Test method for {@link com.flight.controllers.UserController#removeFlight(java.math.BigInteger)}.
	 * @author Garima
	 * @since 30-10-2020
	 */
	
	@Test
	@Rollback
	void testRemoveFlight() {
		userController.removeFlight(new BigInteger("3"));
		boolean checked=false;
		if(fRepo.findById(new BigInteger("3")).isPresent())
		{
			checked=true;
		}
		assertEquals(false, checked);
	}

}
