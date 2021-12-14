package com.abc;

import javax.jws.WebService;

@WebService
public interface Welcome {
	public String hello(String s);
	public int factorial(int x);
}
