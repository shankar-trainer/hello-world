package com.narayanatutorial.serviceImpl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.narayanatutorial.service.VehicleBrand;


@Service
@Profile("Hundai")
public class Hundai implements VehicleBrand {

	@Override
	public String getVehiclName() {
		// TODO Auto-generated method stub
		return "Hundai";
	}

}