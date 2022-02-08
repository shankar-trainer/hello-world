package edu.lpu.servlet.result;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/savingActServlet")
public class savingActServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=	response.getWriter();
	 Object id=request.getAttribute("id");
	 Object city=request.getAttribute("city");
	 
	 out.print("<h2>Welcome to Saving Page</h2>");
	 out.print("<br>Id is "+id);
	 out.print("<br>City is "+city);
	}

}
