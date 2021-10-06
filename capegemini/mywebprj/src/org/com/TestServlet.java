package org.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = 
{"/TestServlet"},initParams = {@WebInitParam(name="name",value="a kumar") } )
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	String name;
	
	public void init(ServletConfig config) throws ServletException {
		name=config.getInitParameter("name");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=	response.getWriter();
	response.setContentType("text/html");
    out.print("name is "+name);
    
    out.print("<br>server name is "+request.getServerName());
    out.print("<br>server port is "+request.getServerPort());
    
    out.print("<br>path  is "+request.getServletContext().getContextPath());
    out.print("<br>content type is "+request.getContentType());
    out.print("<br>method is "+request.getMethod());
        
    out.print("<br>server remote addr "+request.getRemoteAddr());
    out.print("<br>server remote port is "+request.getRemoteHost());
	}

}
