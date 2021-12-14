package org.com;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class Test1 {

	@GET
	@Produces("text/plain")
	public String welcome() {
		return "hello world";
	}
}
