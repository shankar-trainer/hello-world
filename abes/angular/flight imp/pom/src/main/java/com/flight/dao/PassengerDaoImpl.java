package com.flight.dao;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flight.entities.Passenger;
import com.flight.repositories.PassengerRepository;

@Repository
public class PassengerDaoImpl implements PassengerDao {

	@Autowired
	private PassengerRepository passengerRepo;

	@Override
	public Passenger addPassenger(Passenger p) {
		// TODO Auto-generated method stub
		return passengerRepo.save(p);
	}

	@Override
	public Passenger viewPassenger(BigInteger id) {
		return passengerRepo.findById(id).get();
	}

	@Override
	public Passenger getPassengerByPnr(BigInteger pnrNumber) {
		return null;
	}

}
