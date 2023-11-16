package com.narayanatutorial.serviceImpl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.narayanatutorial.service.VehicleBrand;


@Service
//@Profile("Tata")
@Profile("default")
public class Tata implements VehicleBrand {

	@Override
	public String getVehiclName() {
		
		// TODO Auto-generated method stub
		return "Tata";
	}

}