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
import org.springframework.test.annotation.Rollback;

import com.flight.entities.ScheduledFlight;

import com.flight.repositories.ScheduledFlightRepository;
import com.flight.service.ScheduledFlightService;

/**
 * @author Garima
 *
 */
@SpringBootTest
@Transactional
class ScheduledFlightServiceTest {
	@Autowired
	private ScheduledFlightRepository sfrRepo;

	@Autowired
	private ScheduledFlightService sfService;
	
	
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
	 *  {@link com.flight.service.ScheduledFlightServiceImpl#viewScheduledFlightsByFlightNumber(java.math.BigInteger)}.
	 *  @author Garima
	 *  @throws RecordNotFoundException
	 *  @since 30-10-2020
	 */
	@Test
	void testViewScheduledFlightsByFlightNumber() {
		List<ScheduledFlight> sf=sfService.viewScheduledFlightsByFlightNumber(new BigInteger("3"));
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
	 *  {@link com.flight.service.ScheduledFlightServiceImpl#modifyScheduledFlight(com.flight.entities.Flight, com.flight.entities.Schedule, int)}.
	 *   @author Garima
	 *  @throws RecordNotFoundException
	 *  @since 30-10-2020
	 */
	@Test
	@Rollback
	void testModifyScheduledFlight() {
		ScheduledFlight sf=sfrRepo.findById(new BigInteger("5")).get();
		sf.setAvailableSeats(120);
		ScheduledFlight sf1=sfService.modifyScheduledFlight(sf.getFlight(), sf.getSchedule(), sf.getAvailableSeats());
		assertEquals(sf.getAvailableSeats(),sf1.getAvailableSeats());
	}

	/**
	 * Test method for
	 *  {@link com.flight.service.ScheduledFlightServiceImpl#deleteScheduledFlight(java.math.BigInteger)}.
	 *   @author Garima
	 *  @throws RecordNotFoundException
	 *  @since 30-10-2020
	 */
	@Test
	@Rollback
	void testDeleteScheduledFlight() {
		boolean checked=false;
		sfService.deleteScheduledFlight(new BigInteger("5"));
		if(sfrRepo.findById(new BigInteger("5")).isPresent())
		{
			checked=true;
		}
		assertEquals(false,checked);
	}

}
