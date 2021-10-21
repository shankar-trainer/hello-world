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

@WebServlet("/ShoppingLogin")
public class ShoppingLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		LoginDao dao=new LoginDao();
		HttpSession session=request.getSession();
		session.setMaxInactiveInterval(10);
		
		 try {
			String result=dao.LoginValidate(Integer.parseInt(id), pass);
			if(result.equals("success")) {
			   session.setAttribute("id", id);
			  request.getRequestDispatcher("/BuyProduct").
			  forward(request, response);
			}
		   out.print("<h2>Error is </h2>" );
		   out.print(result);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		 
		

		
	}

}
