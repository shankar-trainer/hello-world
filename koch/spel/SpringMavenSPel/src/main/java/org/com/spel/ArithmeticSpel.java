package org.com.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "aspel")
public class ArithmeticSpel {

	@Value("#{20+30}")
	private int add;
	

	@Value("#{T(java.lang.Math).PI}")
	private float multiplier;
	
	public float getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(int multiplier) {
		this.multiplier = multiplier;
	}

	@Value("#{200-30}")
	private int subtract;
	
	@Value("#{20*30}")
	private int multiply;
	
	@Value("#{20/3}")
	private float division;
	
	@Value("#{20 div 3}")
	private float divisionAlpha;
	
	@Value("#{2 ^ 3}")
	private float powerOf;
	
	@Value("#{20%3}")
	private float modulus;

	public float getDivisionAlpha() {
		return divisionAlpha;
	}

	public void setDivisionAlpha(float divisionAlpha) {
		this.divisionAlpha = divisionAlpha;
	}

	public float getPowerOf() {
		return powerOf;
	}

	public void setPowerOf(float powerOf) {
		this.powerOf = powerOf;
	}

	
	
	public int getSubtract() {
		return subtract;
	}

	public void setSubtract(int subtract) {
		this.subtract = subtract;
	}

	public int getMultiply() {
		return multiply;
	}

	public void setMultiply(int multiply) {
		this.multiply = multiply;
	}

	public float getDivision() {
		return division;
	}

	public void setDivision(float division) {
		this.division = division;
	}

	public float getModulus() {
		return modulus;
	}

	public void setModulus(float modulus) {
		this.modulus = modulus;
	}

	public int getAdd() {
		return add;
	}

	public void setAdd(int add) {
		this.add = add;
	}
}
