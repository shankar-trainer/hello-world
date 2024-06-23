package org.abc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserVisitActionCookie")
public class UserVisitActionCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String id = request.getParameter("loginId");
		String name = request.getParameter("loginName");

		Cookie[] cookies = request.getCookies();
		if (cookies == null) {
			response.addCookie(new Cookie("id", id));
			response.addCookie(new Cookie("name", name));
			out.print("<h2>Welcome first time user " + name + "</h2>");
		} else {
			boolean status = false, status1 = false;

			for (Cookie c : cookies) {
				if (c.getName().equals("id") && c.getValue().equals(id)) {
					status = true;
					break;
				}
			}

			for (Cookie c : cookies) {
				if (c.getName().equals("name") && c.getValue().equals(name)) {
					status1 = true;
					break;
				}
			}

			if (status == true && status1 == true) {
				out.print("welcome back " + name);
			} else {
				response.addCookie(new Cookie("id", id));
				response.addCookie(new Cookie("name", name));
				out.print("<h2>Welcome first time user " + name + "</h2>");
			}
		}
	}

}
