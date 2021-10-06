package com.flight.ScheduledFlightTest;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import java.time.LocalDateTime;
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

import com.flight.dao.ScheduledFlightDao;
import com.flight.entities.Airport;
import com.flight.entities.Flight;
import com.flight.entities.Schedule;
import com.flight.entities.ScheduledFlight;
import com.flight.repositories.AirportRepository;
import com.flight.repositories.FlightRepository;
import com.flight.repositories.ScheduleRepository;
import com.flight.repositories.ScheduledFlightRepository;

/**
 * @author Garima
 *
 */
@SpringBootTest
@Transactional
class ScheduledFlightDaoTest {
	
	@Autowired
	private AirportRepository airRepo;

	@Autowired
	private FlightRepository flightRepo;

	@Autowired
	private ScheduledFlightRepository sfrRepo;

	@Autowired
	private ScheduleRepository scheduleRepo;
	
	@Autowired
	private ScheduledFlightDao sfDao;

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
	 *  {@link com.flight.dao.ScheduledFlightDaoImpl#scheduleFlight(com.flight.entities.ScheduledFlight)}.
	 *  @author Garima
	 *  @throws RecordAlreadyPresentException
	 *  @since 30-10-2020
	 */
	@Test
	@Rollback
	void testScheduleFlight() {
		Airport a = new Airport("BarcelonaAirport", "Barcelona", "BCN");
		Airport b = new Airport("MunichAirport", "Munich", "MCN");

		a=airRepo.save(a);
		b=airRepo.save(b);

		Flight f = new Flight(new BigInteger("4334367"), "Etihad", "Boeing", 700);
		f = flightRepo.save(f);
	
		LocalDateTime d = LocalDateTime.now();
		LocalDateTime d1 = LocalDateTime.now();
		Schedule sch = new Schedule(a, b, d, d1);
		sch = scheduleRepo.save(sch);
		ScheduledFlight sf = new ScheduledFlight(f, 700, sch);
		sf = sfrRepo.save(sf);
		ScheduledFlight sf1=sfDao.scheduleFlight(sf);
		assertEquals(sf, sf1);

	}

	/**
	 * Test method for 
	 * {@link com.flight.dao.ScheduledFlightDaoImpl#viewScheduledFlightsByFlightNumber(java.math.BigInteger)}.
	 * @author Garima
	 *  @throws RecordNotFoundException
	 *  @since 30-10-2020
	 */
	@Test
	void testViewScheduledFlightsByFlightNumber() {
		List<ScheduledFlight> sf=sfDao.viewScheduledFlightsByFlightNumber(new BigInteger("3"));
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
	 * {@link com.flight.dao.ScheduledFlightDaoImpl#modifyScheduledFlight(com.flight.entities.Flight, com.flight.entities.Schedule, int)}.
	 * @author Garima
	 *  @throws RecordNotFoundException
	 *  @since 30-10-2020
	 */
	@Test
	@Rollback
	void testModifyScheduledFlight() {
		ScheduledFlight sf=sfrRepo.findById(new BigInteger("5")).get();
		sf.setAvailableSeats(120);
		ScheduledFlight sf1=sfDao.modifyScheduledFlight(sf.getFlight(), sf.getSchedule(), sf.getAvailableSeats());
		assertEquals(sf.getAvailableSeats(),sf1.getAvailableSeats());
	}

	/**
	 * Test method for 
	 * {@link com.flight.dao.ScheduledFlightDaoImpl#deleteScheduledFlight(java.math.BigInteger)}.
	 * @author Garima
	 *  @throws RecordNotFoundException
	 *  @since 30-10-2020
	 */
	@Test
	@Rollback
	void testDeleteScheduledFlight() {
		boolean checked=false;
		sfDao.deleteScheduledFlight(new BigInteger("5"));
		if(sfrRepo.findById(new BigInteger("5")).isPresent())
		{
			checked=true;
		}
		assertEquals(false,checked);
	}

}
