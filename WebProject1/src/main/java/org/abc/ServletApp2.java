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

@WebServlet(urlPatterns = {"/ServletApp2"}, initParams = {
		@WebInitParam(name = "capital",value = "lucknow")
})

public class ServletApp2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			ServletConfig config=getServletConfig();
		
			response.setContentType("text/html");
		response.getWriter().print("capital is "+config.getInitParameter("capital"));
		ServletContext context = getServletContext();
		
		Object attribute1 = context.getAttribute("user");
		Object attribute2 =context.getAttribute("password");
		
		
		response.getWriter().print("<div>user is "+attribute1+"</div>");
		response.getWriter().print("<div>password is "+attribute2+"</div>");
	}
}
