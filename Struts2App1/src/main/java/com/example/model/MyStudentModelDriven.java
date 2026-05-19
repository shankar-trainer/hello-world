package com.example.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class MyStudentModelDriven extends ActionSupport implements ModelDriven<MyStudent>, SessionAware {
	MyStudent student;
	Connection connection;
	Statement st;
	ResultSet rs;

	List<MyStudent> list1;
	

	public MyStudentModelDriven() throws ClassNotFoundException, SQLException {
		list1 = new ArrayList<>();
		student = new MyStudent();
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/montran", "root", "mysql");
	}

	@Override
	public MyStudent getModel() {
		return student;
	}


	public String showallStudent() throws SQLException {
		st = connection.createStatement();
		rs = st.executeQuery("select * from student");
		MyStudent student = null;

		while (rs.next()) {
			student = null;
			student = new MyStudent();
			student.setRoll(rs.getInt(1));
			student.setName(rs.getString(2));
			student.setLocation(rs.getString(3));
			list1.add(student);
		}
		System.out.println("size is......... inside showall  "+list1.size());
		return SUCCESS;
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	Map map1;

	@Override
	public void setSession(Map session) {
		map1 = session;
		System.out.println("list1 size  inside sesessin "+list1.size());
		map1.put("list1", list1);
		
		System.out.println("set session called ............"+map1.get("list1"));
	List l1=	(List) map1.get("list1");
		
		System.out.println("size  ............"+l1.size());
	}
}
