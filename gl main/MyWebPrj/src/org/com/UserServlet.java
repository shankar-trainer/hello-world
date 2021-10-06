package org.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.util.DatabaseUtil;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	Connection con;
	ResultSet rs;
	PreparedStatement pst;
	
	@Override
	public void init() throws ServletException {
		con=DatabaseUtil.retrieveConnection();	
	}	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		String id1 = request.getParameter("id");
		request.getParameterValues("hobby");
		
		String pass1 = request.getParameter("pass");
		try {
			pst=con.prepareStatement("select * from user1 where id=? and password=?");
			pst.setString(1, id1);
			pst.setString(2, pass1);
			rs=pst.executeQuery();
			if(rs.next()){
				response.sendRedirect("UserPage.html");
			}
			else
				{
				out.print("Either UserId or password is wrong");
				out.print("<br><a href='UserRegister.html'>UserRegister</a>");
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*//String qstring = request.getQueryString();
out.print("<div style='font-size:20px;text-align:center;color:blue;background:pink;height:150px ;width:30%;margin-top:100px ;margin-left:400px;border:double blue 4px;padding:20px;'>");
		out.print("welcome ur id is " + id1);

		//out.print("<br>query string " + qstring);
		out.print("</div>");*/
	}

}
