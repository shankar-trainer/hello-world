package com.abc;

import javax.jws.WebService;

@WebService
public class Calculator {

	public int add(int a, int b) {
		return a+b;
	}
	public int division(int a, int b) {
		return a/b;
	}
	
}
