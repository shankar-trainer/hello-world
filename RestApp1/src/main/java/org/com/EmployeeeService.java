package org.com;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/employees")
public class EmployeeeService {

	@GET
	@Path("/showall")
	@Produces("application/json")
	public List<Employee> showAll() throws SQLException {
		return DatabaseTask.getEmployeeList();
	}
	
	
	@GET
	@Path("/showall")
	@Consumes()
	public boolean insertRecord()
	{
		
		return  true;
	}
	
	
}
