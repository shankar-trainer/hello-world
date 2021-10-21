package com.flight.service;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.dao.PassengerDao;
import com.flight.entities.Passenger;

@Service
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	private PassengerDao passengerDao;

	@Override
	public Passenger addPassenger(Passenger p) {
		return passengerDao.addPassenger(p);
	}

	@Override
	public Passenger viewPassenger(BigInteger id) {
		return passengerDao.viewPassenger(id);
	}

	@Override
	public Passenger getPassengerByPnr(BigInteger pnrNumber) {
		return null;
	}

}
