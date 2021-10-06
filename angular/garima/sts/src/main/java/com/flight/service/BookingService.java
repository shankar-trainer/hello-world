package com.flight.service;

import java.math.BigInteger;
import java.util.List;


import com.flight.entities.Booking;
import com.flight.entities.GetSchedule;
import com.flight.entities.ScheduledFlight;
import com.flight.exceptions.RecordNotFoundException;

public interface BookingService {
	List<ScheduledFlight> searchBooking(GetSchedule schedule) throws RecordNotFoundException;

	List<Booking> getUserBookings(BigInteger userId) throws RecordNotFoundException;

	 Booking createBooking(Booking b);

}
