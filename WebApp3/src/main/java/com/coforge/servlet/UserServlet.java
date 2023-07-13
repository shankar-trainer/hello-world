package com.coforge.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/UserServlet",
initParams = {
		@WebInitParam(name = "country", value = "india"),
		@WebInitParam(name = "id", value = "10001"),
		@WebInitParam(name = "name", value = "sanjeet kumar")
})
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int userId;
	String userName;
	String country;

	@Override
	public void init(ServletConfig config) throws ServletException {
	country=	config.getInitParameter("country");
		userId = Integer.parseInt(config.getInitParameter("id"));
		userName = config.getInitParameter("name");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.print("User Information<br>");
		writer.print("<br>User Id " + userId);
		writer.print("<br>User Name " + userName);
		writer.print("<br>User Country " + country);

	}

}
