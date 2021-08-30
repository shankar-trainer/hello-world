package com.montran.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpData extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	
	@Override
	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/montran", "root", "mysql");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<String> list1;
		 try {
			pst=con.prepareStatement("select * from employee where emp_id=?");
			int id=Integer.parseInt(request.getParameter("empid"));
			
			pst.setInt(1, id);
			rs=pst.executeQuery();
			if(rs.next()) {
				list1=new ArrayList<String>();
				list1.add(rs.getString(1));
				list1.add(rs.getString(2));
				list1.add(rs.getString(3));
				list1.add(rs.getString(4));
				request.setAttribute("list1", list1);
				request.getRequestDispatcher("Emppage.jsp").forward(request, response);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	
	}


}
