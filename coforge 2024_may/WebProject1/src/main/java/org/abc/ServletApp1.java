package org.abc;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/ServletApp1"}, initParams = {
		@WebInitParam(name = "city",value = "delhi")
})

public class ServletApp1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			ServletConfig config=getServletConfig();
		
		response.getWriter().print("city is "+config.getInitParameter("city"));
		ServletContext context = getServletContext();
		context.setAttribute("user", "root");
		context.setAttribute("password", "mysql");
	
	}
}
