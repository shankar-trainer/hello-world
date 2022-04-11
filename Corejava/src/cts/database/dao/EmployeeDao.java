package cts.database.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import cts.database.model.Employee;
import cts.database.util.DataBaseUtil;

public class EmployeeDao {

	private Connection con;
	private PreparedStatement pst;
	private Statement st;
	private ResultSet rs;

	private Employee employee;

	public EmployeeDao() throws SQLException {
		con = DataBaseUtil.myConnection();
	}

	public boolean addRecord(Employee employee1) throws SQLException {
		employee = null;
		pst = null;

		employee = searchRecord(employee1.getId());
		if (employee == null) {
			pst = con.prepareStatement("insert into employee values(?,?,?)");
			pst.setInt(1, employee1.getId());
			pst.setString(2, employee1.getName());
			pst.setFloat(3, employee1.getSalary());

			if (pst.executeUpdate() == 1)
				return true;
			else
				return false;
		}
		return false;
	}

	public Employee searchRecord(int id) throws SQLException {
		pst = null;
		rs = null;
		employee = null;

		pst = con.prepareStatement("select * from employee where id=?");
		pst.setInt(1, id);

		rs = pst.executeQuery();
		if (rs.next()) {
			employee = new Employee();
			employee.setId(rs.getInt(1));
			employee.setName(rs.getString(2));
			employee.setSalary(rs.getFloat(3));

		}
		return employee;
	}

	Set<Employee> empSet;

	public Set<Employee> getAllEmployee() throws SQLException {
		empSet = new HashSet<>();

		pst = null;
		rs = null;
		employee = null;

		pst = con.prepareStatement("select * from employee ");

		rs = pst.executeQuery();
		while (rs.next()) {
			employee = null;
			employee = new Employee();
			employee.setId(rs.getInt(1));
			employee.setName(rs.getString(2));
			employee.setSalary(rs.getFloat(3));
			empSet.add(employee);
		}
		return empSet;
	}

}
