package org.com.webservice;

import javax.jws.WebService;

@WebService
public interface Welcome {

	public String test();
	
	public String addition(int a, int b);
	
	
}
