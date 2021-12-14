package org.com;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserResource {

	@POST
	public Response addUser(@FormParam("name") String nm, @FormParam("age") int age) {

		return Response.status(200).entity("User added with name " + nm + " age " + age).build();

	}
}
