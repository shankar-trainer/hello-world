package com.coforge.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/Login", initParams = {
		@WebInitParam(name = "age",value = "20"),
		@WebInitParam(name = "name",value = "raman kumar"),
})
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String userAge;
	String userName;
	String userCountry;
	
	ServletContext ctx;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		userAge=config.getInitParameter("age");
		userName=config.getInitParameter("name");
		ctx=config.getServletContext();
		userCountry=ctx.getInitParameter("country");
	  	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		PrintWriter out = response.getWriter();
		
		String id=request.getParameter("id");
		String pass=request.getParameter("pass");
		String hobbies[]=request.getParameterValues("hb");
		response.setContentType("text/html");
		
		if(id.isBlank()) {
			out.print("id is blank");
		}
		
		else if(pass.isBlank()) {
			out.print("password is blank");
		}
		else if(hobbies==null) {
			out.print("select hobbies");
		}
		else {
			out.print(" <br> ur id  is "+id);
			out.print(" <br> ur name  is "+userName);
			out.print("  <br> ur age  is "+userAge);
			out.print("  <br> ur country   is "+userCountry);
			out.print("<br><br>your hobbies are <br> <ul> ");
			
			Stream.of(hobbies).forEach(a->out.print("<li>"+a));
			out.print("</ul>");
		}
		
		String qstring=request.getQueryString();
		out.print("<br> query string   is "+qstring);
		
		
	}
}
