package com.flight.entities;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "passenger")
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger passengerId;
	private String passengerName;
	private BigInteger pnrNumber;
	private int age;
	private double luggage;

	
	/**
	 * 
	 */
	public Passenger() {

	}

	/**
	 * @param passengerName
	 * @param pnrNumber
	 * @param age
	 * @param luggage
	 * @param booking
	 */
	public Passenger(String passengerName, BigInteger pnrNumber, int age, double luggage) {
		this.passengerName = passengerName;
		this.pnrNumber = pnrNumber;
		this.age = age;
		this.luggage = luggage;
	
	}

	/**
	 * @return the passengerId
	 */
	public BigInteger getPassengerId() {
		return passengerId;
	}

	/**
	 * @param passengerId the passengerId to set
	 */
	public void setPassengerId(BigInteger passengerId) {
		this.passengerId = passengerId;
	}

	/**
	 * @return the passengerName
	 */
	public String getPassengerName() {
		return passengerName;
	}

	/**
	 * @param passengerName the passengerName to set
	 */
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	/**
	 * @return the pnrNumber
	 */
	public BigInteger getPnrNumber() {
		return pnrNumber;
	}

	/**
	 * @param pnrNumber the pnrNumber to set
	 */
	public void setPnrNumber(BigInteger pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the luggage
	 */
	public double getLuggage() {
		return luggage;
	}

	/**
	 * @param luggage the luggage to set
	 */
	public void setLuggage(double luggage) {
		this.luggage = luggage;
	}

	

}
