package edu.lpu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SearchEngineServlet")
public class SearchEngineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String search_name = request.getParameter("search");

		switch (search_name) {
		case "google":
			response.sendRedirect("https://www.google.com/");
			break;
		case "yahoo":
			response.sendRedirect("https://search.yahoo.com/");
			break;
		case "bing":
			response.sendRedirect("https://www.bing.com/");
			break;
		case "duckduckgo":
			response.sendRedirect("https://duckduckgo.com/");
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + search_name);
		}
	}
}