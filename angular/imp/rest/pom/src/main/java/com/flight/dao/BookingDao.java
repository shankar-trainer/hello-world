package com.flight.dao;

import java.math.BigInteger;
import java.util.List;

import com.flight.entities.Booking;
import com.flight.entities.GetSchedule;
import com.flight.entities.ScheduledFlight;

public interface BookingDao {
	
	 List<ScheduledFlight> searchBooking( GetSchedule schedule);
	 List<Booking> getUserBookings(BigInteger userId);
	 Booking createBooking(Booking b);

}