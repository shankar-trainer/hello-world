package org.com;

import javax.jws.WebService;

@WebService
public interface Welcome {

	public String hello(String name);
}
