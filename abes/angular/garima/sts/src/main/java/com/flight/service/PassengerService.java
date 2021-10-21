package com.flight.service;

import java.math.BigInteger;

import com.flight.entities.Passenger;

public interface PassengerService {
	public Passenger addPassenger(Passenger p);

	public Passenger viewPassenger(BigInteger id);

	public Passenger getPassengerByPnr(BigInteger pnrNumber);

}
