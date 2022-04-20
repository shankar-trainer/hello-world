package edu.example.model;

import java.util.List;
import java.util.Set;

public class Passenger {
	private int passengerId;
	private String passengerName;
	private int passengerAge;

	private List<String> placesList;
	private Set<Car> carSet;
	
	public void init() {
		System.out.println("init called");
		this.passengerId=678778;
		this.passengerName="rameshwar sharma";
		this.passengerAge=33;
	}

	public Set<Car> getCarSet() {
		return carSet;
	}

	public void setCarSet(Set<Car> carSet) {
		this.carSet = carSet;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public List<String> getPlacesList() {
		return placesList;
	}

	public void setPlacesList(List<String> placesList) {
		this.placesList = placesList;
	}
	
	

}
