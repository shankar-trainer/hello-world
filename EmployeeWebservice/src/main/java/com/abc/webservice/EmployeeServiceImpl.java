package com.abc.webservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.abc.model.Employee;

@WebService(endpointInterface = "com.abc.webservice.EmployeeService")
public class EmployeeServiceImpl {

	Employee emp1 = null;
	Connection con;
	Statement st;
	ResultSet rs, rs1;
	PreparedStatement pst;

	public EmployeeServiceImpl() throws SQLException {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "mysql");
	}

	@WebMethod(operationName = "getAllEmp")
	public List<Employee> getEmployeeList() throws SQLException {
		List<Employee> list = new ArrayList<>();
		st = con.createStatement();
		rs = st.executeQuery("select * from employee");
		while (rs.next()) {
			emp1 = new Employee();
			emp1.setId(rs.getInt(1));
			emp1.setName(rs.getString(2));
			emp1.setSalary(rs.getFloat(3));
			emp1.setCity(rs.getString(4));
			list.add(emp1);
		}
		return list;
	}

	@WebMethod(operationName = "findEmp")
	public Employee searchEmployee(@WebParam(name = "employeeId") int id) throws SQLException {
		pst = con.prepareStatement("select * from employee where id=?");
		pst.setInt(1, id);
		emp1 = null;
		
		rs1 = pst.executeQuery();
		if (rs1.next()) {
			emp1 = new Employee();
			emp1.setId(rs1.getInt(1));
			emp1.setName(rs1.getString(2));
			emp1.setSalary(rs1.getFloat(3));
			emp1.setCity(rs1.getString(4));
		}
		return emp1;
	}
}
