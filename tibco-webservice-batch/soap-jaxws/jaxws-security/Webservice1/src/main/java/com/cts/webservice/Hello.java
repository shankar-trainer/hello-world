package com.cts.webservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class Hello {

	public String welcome(String name) {
		return "welcome user "+name;
	}
	
}
