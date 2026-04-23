package com.javacodegeeks.jaxws.example;


import jakarta.jws.WebService;

@WebService(endpointInterface = "com.javacodegeeks.jaxws.example.CalculatorI")
public class CalculatorImpl implements CalculatorI {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public int multiply(int a, int b) {
		return a * b;
	}

	@Override
	public int divide(int a, int b) {
		return a / b;
	}

}

