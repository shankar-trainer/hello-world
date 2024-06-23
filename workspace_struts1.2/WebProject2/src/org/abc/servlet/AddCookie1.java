package org.abc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddCookie1")
public class AddCookie1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
		Cookie empName=new Cookie("empname", "aaftab alam");
		Cookie empAge=new Cookie("empage", "30");
		Cookie empsalary=new Cookie("empsalary", "90000");

		empName.setMaxAge(60*60*24*30*365);
		
		response.addCookie(empName);
		response.addCookie(empAge);
		response.addCookie(empsalary);
		response.getWriter().print("employee cookie added");
		
	}

}

