package org.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmpLogin")
public class EmpLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		out.print("<link rel=\"stylesheet\"\r\n"
				+ "	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">");

		String id, name, pass, location;
		id = request.getParameter("id");
		name = request.getParameter("name");
		location = request.getParameter("location");
		pass = request.getParameter("pass");

		if (id.isEmpty() || name.isEmpty() || location.isEmpty() || pass.isEmpty())
			response.sendRedirect("error/EmpError.html");
		else {

			out.print("<div class='container'>");
			out.print("<div class='row'>");

			out.print("<div class='col-sm-4'>");
			out.print("Date " + LocalDate.now());
			out.print("</div>");

			out.print("<div class='col-sm-4'>");
			out.print("<h2>Login SuccessFul</h2>");
			out.print("<br><a href='EmpDetail?id=" + id + " &name=" + name + " &location=" + location
					+ "'>Employee Detail </a>");
			out.print("</div>");


			out.print("<div class='col-sm-4'>");
			out.print("Time " + LocalTime.now());
			out.print("</div>");

			out.print("</div></div>");
			
			
		}
	}
}
