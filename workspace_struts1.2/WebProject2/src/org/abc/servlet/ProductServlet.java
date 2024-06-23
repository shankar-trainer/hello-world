package org.abc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	 PrintWriter out=response.getWriter();
	 response.setContentType("text/html");
	 
	 String id=request.getParameter("loginId");
	 String name=request.getParameter("loginName");

	 //out.print("<style>@IMPORT url('css/style.css');form{width:50%;height:200px; }</style>");
	 
	 out.print("<h3>Welcome "+name+"</h3>");
	 out.print("<h3>Welcome ur id is "+id+"</h3>");
	 
	 out.print("<form action='ProductPaymentServlet'>");
	 
	 out.print("<input  type='hidden' name='id' value="+id+"/>");
	 out.print("<input  type='hidden' name='name' value="+name+"/>");
	 
	 out.print("<label>Enter product1 name</label>");
	 out.print("<input name='prdname1'/><br>");
	 
	 out.print("<label>Enter product1 cost</label>");
	 out.print("<input name='prdcost1'/><br>");
	 
	 out.print("<label>Enter product2 name</label>");
	 out.print("<input name='prdname2'/><br>");
	 
	 out.print("<label>Enter product2 cost</label>");
	 out.print("<input name='prdcost2'/><br>");
	 
	 out.print("<input type='submit' value='Buy'>");
	 out.print("<input type='reset' value='cancel'>");
	 
	 
	 out.print("</form>");
	 
	}


}
