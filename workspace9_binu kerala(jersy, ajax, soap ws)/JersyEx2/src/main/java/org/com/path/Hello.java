package org.com.path;

import java.util.ArrayList;
import java.util.List;

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

	static List<Employee> list1 = new ArrayList<>();

	static {
		Employee emp[]=new Employee[4];
		int id[] = { 1001, 1002, 1003, 1004 };
		String name[] = { "ram kumar", "suresh kumar", "mohan kumar", "kamles kumar" };
		float salary[] = { 20000.0f, 10000, 30000.0f, 8000.0f };
		for (int i = 0; i < salary.length; i++) {
            emp[i]=new Employee();
            emp[i].setId(id[i]);
            emp[i].setName(name[i]);
            emp[i].setSalary(salary[i]);
            list1.add(emp[i]);
		}
	}

	@Path("/result3")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> disp3() {
		return list1;
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
