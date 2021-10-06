package org.com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/NewUser")
public class NewUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie cookie[] = request.getCookies();
		boolean status = false;
		if (cookie==null) {
			System.out.println(" cookie is null.... ");
			response.getWriter().print("Welcome user ");
			Cookie c1 = new Cookie("gl_uid", request.getParameter("id"));
			Cookie c2 = new Cookie("gl_pass", request.getParameter("pass"));
			response.addCookie(c1);
			response.addCookie(c2);

		} 
		if(cookie!=null) {
  			
			for (Cookie cookie2 : cookie) {
				if (cookie2.getName().equals("gl_uid") || cookie2.getName().equals("gl_pass")) {
					response.getWriter().print("Welcome back");
					status = true;
					break;
				}				
			}
		}
		if (!status) {
			System.out.println(" cookie is not null ... ");
			response.getWriter().print("Welcome user ");
			Cookie c1 = new Cookie("gl_uid", request.getParameter("id"));
			Cookie c2 = new Cookie("gl_pass", request.getParameter("pass"));
			response.addCookie(c1);
			response.addCookie(c2);
		}
	}

}
