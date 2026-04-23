package com.cts.webservice;

import com.cts.exception.DivisionException;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.cts.webservice.Calculator")
public class CalculatorImpl implements Calculator {

	@Override
	public int addition(int a, int b) {
		return a+b;
	}

	@Override
	public int subtraction(int a, int b) {
		return a-b;
	}

	@Override
	public int division(int a, int b) throws DivisionException {
	
		if(b==0)
			throw new DivisionException("divided by zero error ");
		
		return a/b;
	}

}
