package com.coforge.Session;

import java.io.IOException;
import java.time.LocalTime;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserSession1")
public class UserSession1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		response.getWriter().print("<br> Session id is " + session.getId());
		response.getWriter().print("<br>Session creation time  is " + new Date(session.getCreationTime()));
		response.getWriter().print("<br>Last accssed time  is " + new Date(session.getLastAccessedTime()));

		response.getWriter().print("<br>max inactive time  is " + session.getMaxInactiveInterval());
		
		session.setMaxInactiveInterval(10);
		
		session.setAttribute("prd1", "book");
		session.setAttribute("prd2", "apple");
		session.setAttribute("id", 665656);
		session.setAttribute("name", "punam devi");
		
		

		
		
	}

}
