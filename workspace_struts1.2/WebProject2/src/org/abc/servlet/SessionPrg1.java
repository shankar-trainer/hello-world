package org.abc.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/hellosession")
public class SessionPrg1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		out.print("<br>Session Id  "+session.getId());
		out.print("<br>Session  created at   "+new Date(session.getCreationTime()));
		out.print("<br>Session  max inactive interval  "+(session.getMaxInactiveInterval()));
		session.setMaxInactiveInterval(10);

	}

}
