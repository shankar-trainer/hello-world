package edu.lpu.servelt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int count;

	@Override
	public void init() throws ServletException {
		System.out.println("init called ");
		count = 1;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("service called ");
		PrintWriter out = response.getWriter();
		out.println("<h1>My First Servlet </h1>");
		out.println("<h1>Page Hits  " + (count++) + "</h1>");
	}

	@Override
	public void destroy() {
		System.out.println("destroy  called ");
	}

}
