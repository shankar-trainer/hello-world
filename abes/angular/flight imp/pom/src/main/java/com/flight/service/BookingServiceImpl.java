package com.flight.service;

import java.math.BigInteger;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.dao.BookingDao;
import com.flight.entities.Booking;
import com.flight.entities.GetSchedule;
import com.flight.entities.ScheduledFlight;
import com.flight.exceptions.RecordNotFoundException;

@Service
public class BookingServiceImpl implements BookingService {
	@Autowired
	BookingDao bookDao;
	
	Logger logger =LoggerFactory.getLogger(BookingServiceImpl.class);
	/**
	 * This function is used to search the bookings when arrival and departure
	 * destination is entered along with the date
	 * 
	 * @param schedule will return the schedule input by the user
	 * @return will return the list of flights according to the schedule
	 * 
	 * @author Sahil Narula
	 * @version 1.0
	 * @throws FlightNotFound 
	 * @since 28-10-2020
	 **/
	@Override
	public List<ScheduledFlight> searchBooking(GetSchedule schedule) throws RecordNotFoundException{
	
		logger.trace("Search Booking service accessed");
			List<ScheduledFlight> flightList = bookDao.searchBooking(schedule);
			if(flightList.size()==0) {
				logger.trace("Flights not found exception thrown");
					throw new RecordNotFoundException("Flight Not found");
			}
			else {
				return flightList;
			}
			
	}

	/**
	 * This function is used to get the list of bookings by user id
	 * 
	 * @param userId will return the schedule input by the user
	 * @return will return the list of bookings in the particular user id
	 * 
	 * @author Sahil Narula
	 * @version 1.0
	 * @throws BookingNotFound 
	 * @since 28-10-2020
	 **/
	@Override
	public List<Booking> getUserBookings(BigInteger userId) throws RecordNotFoundException{
		
		logger.trace("Get Bookings service accessed");
		     
		List<Booking> bookingList=	bookDao.getUserBookings(userId);
			if(bookingList.size()==0 ) {
				logger.trace("Booking Not found exception thrown");
				
				throw new RecordNotFoundException("No bookings present");
			}
			else {
				return bookingList;
			}
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
		// TODO Auto-generated method stub
		logger.trace("Create Booking service accessed");
		
		return bookDao.createBooking(b);
	}

}
