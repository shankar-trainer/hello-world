package com.cognizant.ws;

import javax.jws.WebService;

@WebService(endpointInterface ="com.cognizant.ws.Calculator" )

public class CalculatorImpl  implements Calculator {
	public int addition(int a, int b) {
		return a + b;
	}

}
