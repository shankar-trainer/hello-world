package org.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionServlet1")
public class SessionServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session=request.getSession();
		
		out.print("session id is "+session.getId());
		out.print("<br>session creation time is "
		+new Date(session.getCreationTime()));
		
		out.print("<br>Last visit at  "
				+new Date(session.getLastAccessedTime()));
		
		out.print("<br>session max inactive  interval is "
		+session.getMaxInactiveInterval());
		
		
		
	}

}
