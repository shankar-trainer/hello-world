package org.com.path;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.com.model.Employee;

@Path("/hello")
public class Hello {

	@GET
	@Produces("text/plain")
	public String disp() {
		return "hello world";
	}

	@Path("/result1")
	@GET
	@Produces("text/html")
	public String disp1() {
		return "<h1>hello world....</h1>";
	}

	@Path("/result2")
	@GET
	// @Produces(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_XML)
	// @Produces("application/json")
	// @Produces("application/xml")
	public Employee disp2() {
		Employee employee1 = new Employee();
		employee1.setId(1001);
		employee1.setName("mohan kumar");
		employee1.setSalary(90000);
		return employee1;
	}

	@Path("/sum/{n1}/{n2}")
	@GET
	@Produces
	public String sum(@PathParam("n1") float n1, @PathParam("n2") float n2) {

		return "sum of " + n1 + " and " + n2 + " is " + (n1 + n2);
	}

	@Path("/mul")
	@GET
	@Produces
	public String multiplication(@QueryParam("n1") float n1, @QueryParam("n2") float n2) {

		return "multiplication of " + n1 + " and " + n2 + " is " + (n1 * n2);
	}

}
