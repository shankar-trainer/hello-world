package org.abc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
             //SouthIndianFoodServlet
@WebServlet("/south")
public class SourthIndianFoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 PrintWriter out=response.getWriter();
	 String id=request.getParameter("loginId");
	 String name=request.getParameter("loginName");
	 out.print("<h2>Welcome to South Indian Food Page</h2>");
	 out.println("<br>city  is"+request.getAttribute("city"));
		out.println("<br>state  is"+request.getAttribute("state"));
		
		out.println("id is "+id);
		out.println("<br>Name is "+name);
		
		out.print("<form action='MyOrderDetailServlet'>");
		out.print("<h2>Select Your Food Item</h2>");
		
		out.print("<input type='radio' name='fooditem' value='idli sambhar'>Idli Sambhar <br>");
		out.print("<input type='radio' name='fooditem' value='rice sambhar'>Rice Sambhar <br>");
		out.print("<input type='radio' name='fooditem' value='dosa sambhar'>Dosa Sambhar <br>");
		out.print("<input type='radio' name='fooditem' value='Lemon Rice'>Lemon Rice <br>");
		out.print("<input type='radio' name='fooditem' value='Curd Rice'>Curd Rice<br>");
		
		out.print("<input type='submit'>");
		out.print("<input type='reset'>");
		
		out.print("</form>");
		
		
	}

}
