package com.capgemini.beans.annotation.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ArithmaticSpel {

	@Value("#{10+20}")
	private int add;
	
	@Value("#{100-20}")
	private int subtract;
	
	@Value("#{100*20}")
	private int multiply;
	
	@Value("#{100/20}")
	private int division;
	public int getAdd() {
		return add;
	}
	public void setAdd(int add) {
		this.add = add;
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
	public int getDivision() {
		return division;
	}
	public void setDivision(int division) {
		this.division = division;
	}

}
