package org.abc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MyOrderDetailServlet")
public class MyOrderDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		//session.removeAttribute("name");
		PrintWriter writer = response.getWriter();
if(session.isNew()){
	writer.print("<h1> your session has expired </h1>  ");
	
	writer.println("<br><br><a href='RestaurantPage.html'>Login Again</a>");

}else
		{
		String id = session.getAttribute("id").toString();

		String name = session.getAttribute("name").toString();

		String type = session.getAttribute("type").toString();

		String fitem = request.getParameter("fooditem");

		writer.print("<div style=border:solid;padding:30px;margin-left:200px;margin-top:100px;width:30%>");
		switch (type) {
		case "northindian":
			writer.print("<h1> North Indian  Food item </h1>  ");

			break;
		case "southindian":
			writer.print("<h1> South Indian  Food item </h1>  ");

			break;

		default:
			break;
		}

		writer.print("customer id is " + id);
		writer.print("<br>customer name is " + name);
		writer.print("<br>customer food item  is " + fitem);

		writer.println("<br>city  is" + request.getAttribute("city"));
		writer.println("<br>state  is" + request.getAttribute("state"));
		writer.print("</div>");

		writer.println("<br><a href='Logout'>LogOut</a>");
		}
	}

}
