/**
 * 
 */
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

import com.flight.entities.Flight;
import com.flight.repositories.FlightRepository;
import com.flight.service.FlightService;

/**
 * @author Garima
 *
 */
@SpringBootTest
@Transactional
class FlightServiceTest {
	
	@Autowired
	private FlightService flightService;
	
	@Autowired
	private FlightRepository flightRepo;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 *  {@link com.flight.service.FlightServiceImpl#addFlight(com.flight.entities.Flight)}.
	 *  @author Garima
	 * @since 30-10-2020
	 */
	@Test
	@Rollback
	void testAddFlight() {
		Flight f1=new Flight(new BigInteger("124587"),"Indigo","ASD1234",500);
		Flight f2=flightService.addFlight(f1);
		assertEquals(f1.getCarrierName(), f2.getCarrierName());
	}

	/**
	 * Test method for
	 *  {@link com.flight.service.FlightServiceImpl#viewFlight(java.math.BigInteger)}.
	 *  @author Garima
	 * @since 30-10-2020
	 */
	@Test
	@Rollback
	void testViewFlight() {
		Flight actual=flightService.viewFlight(new BigInteger("3"));
		Flight expected=flightRepo.getOne(new BigInteger("3"));
		assertEquals(expected.getCarrierName(), actual.getCarrierName());
	}

	/**
	 * Test method for 
	 * {@link com.flight.service.FlightServiceImpl#modifyFlight(com.flight.entities.Flight)}.
	 * @author Garima
	 * @since 30-10-2020
	 */
	@Test
	@Rollback
	void testModifyFlight() {
		Flight f2=flightRepo.getOne(new BigInteger("3"));
		f2.setSeatCapacity(250);
		Flight f3=flightService.modifyFlight(f2);
		assertEquals(f2.getSeatCapacity(),f3.getSeatCapacity());
	}

	/**
	 * Test method for {@link com.flight.service.FlightServiceImpl#deleteFlight(java.math.BigInteger)}.
	 * @author Garima
	 * @since 30-10-2020
	 */
	@Test
	@Rollback
	void testDeleteFlight() {
		flightService.deleteFlight(new BigInteger("3"));
		boolean checked=false;
		if(flightRepo.findById(new BigInteger("3")).isPresent())
		{
			checked=true;
		}
		assertEquals(false, checked);
	}

}
