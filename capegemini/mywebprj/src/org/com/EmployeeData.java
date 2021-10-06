package org.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.com.util.DatabaseUtil;

@WebServlet("/EmployeeData")
public class EmployeeData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection connection;
	ResultSet rs;
	Statement st;
   String user,driver,password,url;
    ServletContext ctx;
	
	
	@Override
	public void init(ServletConfig config) throws ServletException{
		try {
			ctx=config.getServletContext();
			user=ctx.getInitParameter("user");
			driver=ctx.getInitParameter("driver");
			url=ctx.getInitParameter("url");
			password=ctx.getInitParameter("password");

			System.out.println(user);
			System.out.println(driver);
			System.out.println(url);
			System.out.println(password);
			
			Class.forName(driver);
			 connection=DriverManager.getConnection(url, user, password);
			//connection = DatabaseUtil.myconnection();
			
		} catch (SQLException|ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		try {
			st = connection.createStatement();
			rs = st.executeQuery("select * from employee");
		
out.print("<table style='background-color:aqua;border:double 4px blue;'>");
			while(rs.next())
            {
          out.print
   ("<tr><td>"+rs.getInt(1)+"</td><td> "
          +rs.getString(2)+"</td><td> "
             +rs.getFloat(3)+"</td></tr>");
            }
			out.print("</table>");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
