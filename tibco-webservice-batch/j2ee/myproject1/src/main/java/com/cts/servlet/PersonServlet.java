package com.cts.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/PersonServlet")

//@WebServlet("/PersonAction")
@WebServlet(urlPatterns = {"/PersonAction","/PersonServlet"})
public class PersonServlet extends HttpServlet {
	int id;
	String name;
	
	@Override
	public void init() throws ServletException {
      id=0;
      name=null;
	}

	// doGet works with get method in html form 
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                id= Integer.parseInt(req.getParameter("id"));
                name= req.getParameter("name");
                PrintWriter out=resp.getWriter();
                out.print("<br>Person Infomation");
                out.print("<br>Person id :"+id);
                out.print("<br>Person Name :"+name);
	 }

	@Override
	public void destroy() {

	}

}
