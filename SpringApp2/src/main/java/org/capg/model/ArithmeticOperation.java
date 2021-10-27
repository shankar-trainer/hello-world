package org.capg.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ArithmeticOperation {

	@Value("#{2*T(java.lang.Math).PI}")
	public int multiplier;

	//@Value("#{10/2}")
	@Value("#{10 div 2}")
	public int division;
	@Value("#{10%7}")
	public int modulus;
	
	@Value("#{10^3}")
	public int power;
	
	@Value("#{1+2}")
	public int addition;
	@Value("#{1-2}")
	public int subtraction;
	@Value("#{10*2}")
	public int multiplication;
	
	public int getModulus() {
		return modulus;
	}

	public void setModulus(int modulus) {
		this.modulus = modulus;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(int multiplier) {
		this.multiplier = multiplier;
	}

	
	
	
	

	public int getAddition() {
		return addition;
	}

	public void setAddition(int addition) {
		this.addition = addition;
	}

	public int getSubtraction() {
		return subtraction;
	}

	public void setSubtraction(int subtraction) {
		this.subtraction = subtraction;
	}

	public int getMultiplication() {
		return multiplication;
	}

	public void setMultiplication(int multiplication) {
		this.multiplication = multiplication;
	}

	public int getDivision() {
		return division;
	}

	public void setDivision(int division) {
		this.division = division;
	}

}
