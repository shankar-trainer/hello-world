package com.pathinfotech.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EmployeeRegistration  extends ActionSupport implements ModelDriven<Employee>,SessionAware{

	Employee employee;
	Connection connection;
	PreparedStatement pst;
	Statement st;
	ResultSet rs;
	
	public EmployeeRegistration() throws SQLException {
	 employee=new Employee();
	 connection=DatabaseUtil.myDatabaseConnection();

	}
	
	@Override
	public Employee getModel() {
		return  employee;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("excute called ");
		if(employee.getEmpId()<=0) {
		addActionError("invalid employee id ");
		return  INPUT;
		}
		else if(employee.getEmpName().isEmpty()) {
			addActionError("invalid employee name ");
		return  INPUT;
		}
		else if(employee.getEmpSalary()<=0) {
			addActionError("invalid employee salary ");
		return  INPUT;
		}
		else 
			return  SUCCESS;
	}
	
	public String addEmployee() throws Exception {
		
		 System.out.println("add employee works");
		return  SUCCESS;
		
	}
	public String removeEmployee() throws Exception {
		System.out.println("remove employee works");
		return  SUCCESS;
		
	}
	public String updateEmployee() throws Exception {
		System.out.println("update employee works");
		return  SUCCESS;
		
	}
	public String searchEmployee() throws Exception {
		System.out.println("search employee works");
		return  SUCCESS;
		
	}
	List<Employee> emplist;
	public String showAllEmployee() throws Exception {
		System.out.println("showall  employee works");
		st=connection.createStatement();
		rs=null;
		
		rs=st.executeQuery("select * from employee");
		 emplist=new ArrayList<>();
		while(rs.next()) {
			employee=null;
			employee=new Employee();
			employee.setEmpId(rs.getInt(1));
			employee.setEmpName(rs.getString(2));
			employee.setEmpSalary(rs.getFloat(3));
			emplist.add(employee);
		}
		return  SUCCESS;
	}

	Map<String, Object> map1;
	
	@Override
	public void setSession(Map<String, Object> session) {
     map1=session;
     map1.put("list1", emplist);
	}
}
