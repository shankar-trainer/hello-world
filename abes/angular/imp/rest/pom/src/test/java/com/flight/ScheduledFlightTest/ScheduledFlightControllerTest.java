package com.flight.ScheduledFlightTest;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.flight.controllers.UserController;
import com.flight.entities.ScheduledFlight;
import com.flight.repositories.ScheduledFlightRepository;

/**
 * @author Garima
 *
 */

@SpringBootTest
@Transactional
class ScheduledFlightControllerTest {
	
	@Autowired
	private UserController userController;
	

	@Autowired
	private ScheduledFlightRepository sfrRepo;



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
	 *  {@link com.flight.controllers.UserController#viewScheduledFlightByFlightId(java.math.BigInteger)}.
	 *  @author Garima
	 *  @since 30-10-2020
	 */
	@Test
	void testViewScheduledFlightByFlightId() {
		List<ScheduledFlight> sf=userController.viewScheduledFlightByFlightId(new BigInteger("3"));
		List<ScheduledFlight>flights=new ArrayList<>();
		List<ScheduledFlight> scheduledFlight=sfrRepo.findAll();
		for(ScheduledFlight sf1:scheduledFlight)
		{
			if(sf1.getFlight().getFlightNumber().equals(new BigInteger("3")))
			{
				flights.add(sf1);
			}
		}
		assertEquals(flights, sf);
	}

	/**
	 * Test method for 
	 * {@link com.flight.controllers.UserController#deleteScheduledFlight(java.math.BigInteger)}.
	 * @author Garima
	 * @since 30-10-2020
	 */
	@Test
	void testDeleteScheduledFlight() {
		boolean checked=false;
		userController.deleteScheduledFlight(new BigInteger("5"));
		if(sfrRepo.findById(new BigInteger("5")).isPresent())
		{
			checked=true;
		}
		assertEquals(false,checked);
	}

	/**
	 * Test method for
	 *  {@link com.flight.controllers.UserController#modifyScheduleFlight(com.flight.entities.ScheduledFlight)}.
	 *  @author Garima
	 *  @since 30-10-2020
	 */
	@Test
	void testModifyScheduleFlight() {
		ScheduledFlight sf=sfrRepo.findById(new BigInteger("5")).get();
		sf.setAvailableSeats(120);
		ScheduledFlight sf1=userController.modifyScheduleFlight(sf);
		assertEquals(sf.getAvailableSeats(),sf1.getAvailableSeats());
	}
}
