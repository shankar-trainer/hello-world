package org.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionDemo1")
public class SessionDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();

		out.print("Session id " + session.getId());
		out.print("<br>Session created at  " + new Date(session.getCreationTime()));

		out.print("<br>Session last accessed at  " + new Date(session.getLastAccessedTime()));
		out.print("<br>Session max inactive interval " + session.getMaxInactiveInterval());
		session.setMaxInactiveInterval(10);
		
		session.setAttribute("mobile", "realme");
		session.setAttribute("cost", 7000.0f);
		session.setAttribute("seller", "flipkart");
		
		out.print("<br><br><a href='ProductDetail'>Product  Detail</a>");
	}
}
