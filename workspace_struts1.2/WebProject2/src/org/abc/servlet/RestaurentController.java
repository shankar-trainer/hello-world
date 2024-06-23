package org.abc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/RestaurentController")
public class RestaurentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String id = request.getParameter("loginId");
		String name = request.getParameter("loginName");
		String type = request.getParameter("type");

		if (id == null || id=="") {
			out.println("<div style=border:solid;padding:30px;margin-left:200px;margin-top:100px;width:30%>");
			out.println("<span style=color:red;font-weight:bold>Id is blank</span>");
			out.println("<br><a href='RestaurantPage.html'> go back again</a>");
			out.println("</div>");
		}

		else if (name == null || name=="") {
			out.println("<div style=border:solid;padding:30px;margin-left:200px;margin-top:100px;width:30%>");
			out.println("<div style=color:red;font-weight:bold>name is blank</div>");
			out.println("<br><a href='RestaurantPage.html'> go back again</a>");
			out.println("</div>");
		}

		else if (type == null || type=="") {
			out.println("<div style=border:solid;padding:30px;margin-left:200px;margin-top:100px;width:30%>");
			out.println("<div style=color:red;font-weight:bold>you have not selected any type</div>");
			out.println("<br><a href='RestaurantPage.html'> go back again</a>");
			out.println("</div>");
		}

		else  {
			RequestDispatcher dispatcher;

			HttpSession session=request.getSession();
			session.setAttribute("id", id);
			session.setAttribute("name", name);
			session.setAttribute("type", type);
			
			session.setMaxInactiveInterval(10);
			
			switch (type) {
			case "northindian":
				request.setAttribute("city", "new delhi");
				request.setAttribute("state", "delhi");
				
				
				dispatcher = request.getRequestDispatcher("north");
				dispatcher.forward(request, response);
				break;

			case "southindian":
				request.setAttribute("city", "chennai");
				request.setAttribute("state", "tamil nadu");

				dispatcher = request.getRequestDispatcher("south");
				dispatcher.forward(request, response);

				break;

			default:
				out.println("<div style=color:red;font-weight:bold> default you have not selected any type</div>");
				out.println("<br><a href='RestaurentPage.html'> go back again</a>");
				break;
			}
		}

	}
}
