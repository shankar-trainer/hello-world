package com.flight.BookingTest;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.flight.dao.BookingDao;
import com.flight.dao.BookingDaoImpl;
import com.flight.entities.Booking;
import com.flight.entities.GetSchedule;
import com.flight.entities.Passenger;
import com.flight.entities.Schedule;
import com.flight.entities.ScheduledFlight;
import com.flight.entities.User;
import com.flight.exceptions.RecordNotFoundException;

@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest
public class BookingTestDao {

	@Autowired
	BookingDao bookingDao;

	/**
	 * This function will test the search functionality of the DAO Layer
	 * 
	 * @throws FlightNotFound
	 * @author Sahil Narula
	 * @since 30-10-2020
	 */
	@Test
	public void testSearchFunction() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDateTime time = LocalDateTime.now();

		GetSchedule schedule = new GetSchedule();
		schedule.setArrival("Barcelona");
		schedule.setDeparture("Munich");
		schedule.setDate(time.format(formatter));
		List<ScheduledFlight> flightList = bookingDao.searchBooking(schedule);

		Assert.assertNotNull(flightList);

	}

	/**
	 * This function will test the get booking by user id functionality of the DAO
	 * Layer
	 * 
	 * @throws FlightNotFound
	 * @author Sahil Narula
	 * @since 30-10-2020
	 */
	@Test
	public void testGetBookingByUserId() {

		List<Booking> bookingList = bookingDao.getUserBookings(new BigInteger("2"));
		Assert.assertNotNull(bookingList);

	}

	/**
	 * This function will test the create booking functionality of the DAO Layer
	 * 
	 * @throws FlightNotFound
	 * @author Sahil Narula
	 * @since 30-10-2020
	 */
	@Test
	public void testMakeBookings() {
		User u = new User("user", "amitabh", "sadadsa", "2323232324", "amitabh@gmail.com");

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDateTime time = LocalDateTime.now();
		LocalDateTime d = LocalDateTime.now();
		GetSchedule schedule = new GetSchedule();
		schedule.setArrival("Barcelona");
		schedule.setDeparture("Munich");
		schedule.setDate(time.format(formatter));
		ScheduledFlight sf = bookingDao.searchBooking(schedule).get(0);

		Passenger p1 = new Passenger("adsa1", new BigInteger("4334357"), 11, 212);

		List<Passenger> lp = new ArrayList<Passenger>();
		lp.add(p1);

		Booking booking = new Booking(u, d, 500.0, sf, 1, lp);

		Booking bookedObject = bookingDao.createBooking(booking);

		Assert.assertEquals(bookedObject, booking);

	}
}
