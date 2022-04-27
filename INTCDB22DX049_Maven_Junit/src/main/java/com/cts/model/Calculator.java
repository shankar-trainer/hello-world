package com.cts.model;

public class Calculator {

	public float addition(float x, float y) {
      return x+y;
	}
	public float subtraction(float x, float y) {
		return x-y;
	}
	public float multiplication(float x, float y) {
		return x*y;
	}
	public float division(float x, float y) {
		if(y==0)
			throw new IllegalArgumentException("divided by zero error");
		return x/y;
	}
}
