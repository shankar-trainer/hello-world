package org.com.webservice;

import javax.jws.WebService;

@WebService
(endpointInterface="org.com.webservice.Welcome")
public class WelcomeImpl  implements Welcome{

	@Override
	public String test() {
		return "welcome to jax-ws";
	}
	
	@Override
	public String addition(int a, int b){
		return "sum of"+a+" and "+b+" is "+(a+b);
	}

}
