package abc.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/mychoice")
public class MySite extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String ch = request.getParameter("ch");
		if (ch == null) {
			out.print("<font color='red' size='20'>you have not selected any choice </font>");
		  out.print("<br><br><a href='MyChoice.html'>go back</a>");
		}
		else {
			switch (ch) {
			case "google":
				response.sendRedirect("https://www.google.com/");
				break;

			case "bing":
				response.sendRedirect("https://www.bing.com/");
				break;

			case "yahoo":
				response.sendRedirect("https://in.yahoo.com");
				break;

			case "facebook":
				response.sendRedirect("https://www.facebook.com/");
				break;

			default:
				out.print("select the some correct value");
				break;
			}
		}
	}

}
