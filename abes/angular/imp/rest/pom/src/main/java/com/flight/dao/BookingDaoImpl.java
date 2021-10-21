package com.flight.dao;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flight.entities.Booking;
import com.flight.entities.GetSchedule;
import com.flight.entities.ScheduledFlight;
import com.flight.repositories.AirportRepository;
import com.flight.repositories.BookingRepository;
import com.flight.repositories.FlightRepository;
import com.flight.repositories.PassengerRepository;
import com.flight.repositories.ScheduleRepository;
import com.flight.repositories.ScheduledFlightRepository;
import com.flight.repositories.UserRepository;

@Repository
public class BookingDaoImpl implements BookingDao {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private AirportRepository airRepo;

	@Autowired
	private FlightRepository flightRepo;

	@Autowired
	private PassengerRepository passengerRepo;

	@Autowired
	private ScheduledFlightRepository sfrRepo;

	@Autowired
	private ScheduleRepository scheduleRepo;

	@Autowired
	private BookingRepository bookingRepo;

	
	Logger logger = LoggerFactory.getLogger(BookingDaoImpl.class);
	
	/**
	 * This function is used to search the bookings when arrival and departure
	 * destination is entered along with the date
	 * 
	 * @param schedule will return the schedule input by the user
	 * @return will return the list of flights according to the schedule
	 * 
	 * @author Sahil Narula
	 * @version 1.0
	 * @since 28-10-2020
	 **/
	@Override
	public List<ScheduledFlight> searchBooking(GetSchedule schedule) {
		logger.trace("Search Booking Dao layer accessed");
		
		List<ScheduledFlight> getAllSchedules = sfrRepo.findAll();
		List<ScheduledFlight> foundSchedules = new ArrayList<ScheduledFlight>();
		for (ScheduledFlight sch : getAllSchedules) {
			String arrivalLocation = sch.getSchedule().getSourceAirport().getAirportLocation();
			String departureLocation = sch.getSchedule().getDestinationAirport().getAirportLocation();
			DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDateTime date = sch.getSchedule().getArrival();

			String formattedDate = date.format(parser);

			if (arrivalLocation.equals(schedule.getArrival()) && departureLocation.equals(schedule.getDeparture())
					&& formattedDate.equals(formattedDate)) {
				foundSchedules.add(sch);
			
			}

		}

		return foundSchedules;
	}

	/**
	 * This function is used to get the list of bookings by user id
	 * 
	 * @param userId will return the schedule input by the user
	 * @return will return the list of bookings in the particular user id
	 * 
	 * @author Sahil Narula
	 * @version 1.0
	 * @since 28-10-2020
	 **/
	@Override
	public List<Booking> getUserBookings(BigInteger userId) {
		// TODO Auto-generated method stub
		logger.trace("Get User Booking Dao layer accessed");
		
		List<Booking> getAllBookings = bookingRepo.findAll();
		List<Booking> getUserBookings = new ArrayList<Booking>();
		
		
		
		for (Booking b : getAllBookings) {
			
			BigInteger buid = b.getUserId().getUserId();
			if (buid.equals(userId)) {
				getUserBookings.add(b);
			}
		}
		
		return getUserBookings;
	}


	/**
	 * This function is used to create booking for a user
	 * @param b will return the booking object input by the user
	 * @return will return the booked booking
	 * 
	 * @author Sahil Narula and Amitabh Saxena
	 * @version 1.0 
	 * @since 28-10-2020
	**/
	@Override
	public Booking createBooking(Booking b) {
	
		logger.trace("Create Booking Dao layer accessed");
		
		return bookingRepo.save(b);
	}


}
