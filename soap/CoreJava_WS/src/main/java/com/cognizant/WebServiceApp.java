package com.cognizant;

import javax.xml.ws.Endpoint;

import com.cognizant.ws.Calculator;
import com.cognizant.ws.CalculatorImpl;

public class WebServiceApp {

	public static void main(String[] args) {
		
		CalculatorImpl calculator=new CalculatorImpl();
		Endpoint.publish("http://localhost/calc", calculator)	;
		
	}
}
