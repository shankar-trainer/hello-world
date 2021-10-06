package com.flight.dao;

import java.math.BigInteger;

import com.flight.entities.Passenger;

public interface PassengerDao {
	public Passenger addPassenger(Passenger p);

	public Passenger viewPassenger(BigInteger id);

	public Passenger getPassengerByPnr(BigInteger pnrNumber);
}
