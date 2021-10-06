package org.com.shopping;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.com.dao.LoginDao;

@WebServlet("/BuyProduct")
public class BuyProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		{
			out.print("<br><a href='Logout'>Logout</a><br>");
			

			out.print("<center>Ur id is " + id + "</center>");

			out.print("<link rel='stylesheet' href='style/style1.css'>");

			out.print("<form action='MyKart'>");

			out.print("Buy Product1 <input name='prd1'>");
			out.print("<br>Buy Product2 <input name='prd2'>");
			out.print("<br><input type='submit' value='Login'>");
			out.print("<input type='reset' value='Cancel'>");
			out.print("</form>");
		}
	}

}
