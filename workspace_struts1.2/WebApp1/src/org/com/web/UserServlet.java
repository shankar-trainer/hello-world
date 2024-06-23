package org.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String country;
	String state;
	String servletName;

	// Enumeration<String> initParameterNames;
	// String ar[] = new String[2];

	@Override
	public void init(ServletConfig config) throws ServletException {
		country = config.getInitParameter("country");
		state = config.getInitParameter("state");
		servletName = config.getServletName();
		/*
		 * initParameterNames = config.getInitParameterNames(); int x = 0;
		 * 
		 * while (initParameterNames.hasMoreElements()) ar[x++] =
		 * initParameterNames.nextElement();
		 * 
		 * country = config.getInitParameter(ar[0]); state =
		 * config.getInitParameter(ar[1]);
		 */
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("userId");
		String name = request.getParameter("userName");
		String salary = request.getParameter("userSalary");
		PrintWriter out = response.getWriter();

		out.print("id is " + id);
		out.print("<br>name is " + name);
		out.print("<br>salary is " + salary);
		out.print("<br>state is " + state);
		out.print("<br>country  is " + country);
		// out.print("<br>" + ar[0] + " is " + country);
		// out.print("<br>" + ar[1] + " is " + state);

		System.out.println("doget called ");

		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		long id = Long.parseLong(request.getParameter("userId"));
		String name = request.getParameter("userName");
		float salary = Float.parseFloat(request.getParameter("userSalary"));
		// String cities = request.getParameter("cities");
		String cities[] = request.getParameterValues("cities");
		PrintWriter out = response.getWriter();

		Enumeration<String> parameterNames = request.getParameterNames();
		out.print("<br>Parameter Names<br>");

		while (parameterNames.hasMoreElements())
			out.println("<br>" + parameterNames.nextElement());

		out.println("<br> Query String is " + request.getQueryString());
		out.println("<br> Method is " + request.getMethod());

		response.setContentType("text/html");

		out.print("id is " + id);
		out.print("<br>name is " + name);
		out.print("<br>salary is " + salary);
		out.print("<br>cities are " + Arrays.toString(cities));

		out.println("<br><ol>");
		for (String s : cities) {
			out.print("<li>" + s);
		}
		out.println("</ol>");

		System.out.println("do post called ");
	}

}
