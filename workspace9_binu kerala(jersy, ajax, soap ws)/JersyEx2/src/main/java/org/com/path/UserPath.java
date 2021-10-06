package org.com.path;

import javax.ws.rs.CookieParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/user")
public class UserPath {

	// @Path("/username/{name}")
	@Path("/username/{name:[a-zA-Z][a-zA-Z0-9]+}")
	// @Path("/username/{name:[a-zA-Z][a-zA-Z0-9]+[\\s][a-zA-Z0-9]+}")
	@GET
	public String user1(@PathParam("name") String name) {
		return "welcome " + name;
	}

	@GET
	@Path("/header")
	public Response addUser(@HeaderParam("accept") String accept) {

		System.out.println(Response.status(200).entity("user added" + accept).build());
		return Response.status(200).entity("user added").build();
	}

	@POST
	// @GET
	@Path("/adduser")
	public Response submitUser(@FormParam("fname") String fname, @FormParam("lname") String lname) {
		return Response.status(200).entity("user added with name " + fname + "   " + lname).build();
	}


	@GET
	@Path("/getsession")
	public String  mySession(@CookieParam("sessionid") int id) {
		return "Session id is "+id;
	}
	
}
