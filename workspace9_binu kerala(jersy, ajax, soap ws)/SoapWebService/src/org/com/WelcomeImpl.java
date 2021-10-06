package org.com;

import javax.jws.WebService;

@WebService
public class WelcomeImpl  implements Welcome {

	@Override
	public String hello(String name) {
		return "hello  "+name;
	}
	
}
