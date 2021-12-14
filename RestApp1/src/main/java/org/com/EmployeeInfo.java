package org.com;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/emp")
public class EmployeeInfo {

	@GET
	@Produces("application/json")
	public Employee getEmpInfo() {
		Employee emp1 = new Employee();
		emp1.setId(10001);
		emp1.setName("hare ram kumar");
		emp1.setSalary(12000);
		return emp1;
	}

	static List<Employee> emplist = new ArrayList<>();
	static {
		int id[] = { 1003, 1004, 1001, 1008 };
		String nm[] = { "s kumar", "a kumar", "parshuram", "anand kumar" };
		float salary[] = { 20000, 10000, 18000, 9000 };
		Employee emp1 = null;
		for (int i = 0; i <= 3; i++) {
			emp1 = null;
			emp1 = new Employee();
			emp1.setId(id[i]);
			emp1.setName(nm[i]);
			emp1.setSalary(salary[i]);
			emplist.add(emp1);
		}
	}

	@Path("/allEmp")
	@GET
	@Produces("application/json")
	public List<Employee> getAllEmployee() {
		return emplist;
	}
	
	@Path("/allEmp1")
	@GET
	@Produces("application/xml")
	public List<Employee> getAllEmployee1() {
		return emplist;
	}

	@Path("/searchEmp/{id}")
	@GET
	@Produces("application/json")
	public Employee searchEmpInfo(@PathParam("id") int empid) {

		Employee e1 = null;
		for (Employee e : emplist) {
			if (e.getId() == empid) {
				e1 = e;
				break;
			}
		}
		return e1;
	}
}
