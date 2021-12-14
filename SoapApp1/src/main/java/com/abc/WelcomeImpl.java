package com.abc;

import javax.jws.WebService;

@WebService(endpointInterface = "com.abc.Welcome")
public class WelcomeImpl implements Welcome {

	public String hello(String s) {
		return "greeting ...." + s;
	}

	@Override
	public int factorial(int x) {
		int fact = 1;
		for (int i = 1; i <= x; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
