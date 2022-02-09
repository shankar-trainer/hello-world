package com.lpu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletSession")
public class ServletSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
     	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session=request.getSession();
	
     PrintWriter out=		response.getWriter();
	out.println("session id is "+session.getId());
	out.println("<br>session max inactive interval is "+session.getMaxInactiveInterval());
	out.println("<br>session creation time  is "+new Date(session.getCreationTime()));
	out.println("<br>last logged in  time  is "+new Date(session.getLastAccessedTime()));
	session.setAttribute("prd1", "java book");
	session.setAttribute("prd1cost", 1567.90f);
     	}

}
