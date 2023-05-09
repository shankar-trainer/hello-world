package com.abc.model;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class EmployeeModelDriven extends ActionSupport implements ModelDriven<Employee>, SessionAware {

	Connection connection;
	Statement st;
	ResultSet rs;

	Employee employee;
	List<Employee> list1 = new ArrayList<>();

	public EmployeeModelDriven() throws ClassNotFoundException, SQLException {
		employee = new Employee();
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db1", "root", "");
	}

	Map<String,Object> map1;
	@Override
	public void setSession(Map<String, Object> session) {
		map1=session;
		map1.put("list1", list1);

	}

	@Override
	public Employee getModel() {
		return employee;
	}

	public String showallEmployee() throws SQLException {
		st = connection.createStatement();
		rs = st.executeQuery("select * from employee");
		Employee employee = null;

		while (rs.next()) {
			employee = null;
			employee = new Employee();

			employee.setId(rs.getInt(1));
			employee.setName(rs.getString(2));
			employee.setSalary(rs.getFloat(3));
			list1.add(employee);
		}
		System.out.println("size is......... inside showall  " + list1.size());
		return SUCCESS;
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
}
