package edu.lpu.servelt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//protected void doGet(HttpServletRequest request, HttpServletResponse response)
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String hobby[]=request.getParameterValues("hobby");
		int id1=Integer.parseInt(id);
		
		out.print("<h1>Employee Information</h1>");
		out.print("Id is "+id1);
		out.print("<br>Name is "+name);
		out.print("<br>Gender  is "+gender);
		out.print("<br>your hobbies are  ");
		  out.print("<ul>");
		for (String string : hobby) {
		    out.print("<li>"+string);	
		}
		out.print("</ul>");
		
	}

}



