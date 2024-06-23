package org.abc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/NorthIndianFoodServlet")
//@WebServlet("/north")
@WebServlet(urlPatterns={ "/north","/NorthIndianFoodServlet"})

public class NorthIndianFoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 PrintWriter out=response.getWriter();
	 String id=request.getParameter("loginId");
	 String name=request.getParameter("loginName");
	 out.println("<div style=border:solid;padding:30px;margin-left:200px;margin-top:100px;width:30%>");
	 out.print("<h2>Welcome to North Indian Food Page</h2>");
		out.println("id is "+id);
		out.println("<br>Name is "+name);
		
		out.println("<br>city  is"+request.getAttribute("city"));
		out.println("<br>state  is"+request.getAttribute("state"));
		
		out.print("<form action='MyOrderDetailServlet'>");
		out.print("<h2>Select Your Food Item</h2>");
		
		out.print("<input type='radio' name='fooditem' value='chhole bhatore'>Chhole Bhatore <br>");
		out.print("<input type='radio' name='fooditem' value='rajma chawal'>Rajma Chawal <br>");
		out.print("<input type='radio' name='fooditem' value='chawal dal'>Chawal Dal <br>");
		out.print("<input type='radio' name='fooditem' value='dal bhati churma'>Dal Bhati Churma <br>");
		out.print("<input type='radio' name='fooditem' value='litti hhokha'>Litti Chokha <br>");
		
		out.print("<input type='submit'>");
		out.print("<input type='reset'>");
		
		out.print("</form>");
		out.print("</div>");
		
		
	}

}
