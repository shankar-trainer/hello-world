package com.hcl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String dob = request.getParameter("dob");
		String phone = request.getParameter("phone");
		String gender = request.getParameter("gender");
		String qualification = request.getParameter("qualification");
		String language[] = request.getParameterValues("language");
		if (id == "" || id.isEmpty()) {
			out.print("<p style='color:red;text-align:center;font-size:20;font-weight:bold;'>Id is empty </p>");

		}

		else if (name == "" || name.isEmpty()) {
			out.print("<p style='color:red;text-align:center;font-size:20px'>Name is empty </p>");

		}
		
		else if (pass == "" || pass.isEmpty()) {
			out.print("<p style='color:red;text-align:center;font-size:20px'>Password is empty </p>");
			
		}
		
		else if (dob == "" || dob.isEmpty()) {
			out.print("<p style='color:red;text-align:center;font-size:20px'>Dob is empty </p>");
			
		}
		
		else if (phone == "" || phone.isEmpty()) {
			out.print("<p style='color:red;text-align:center;font-size:20px'>Phone Number is empty </p>");
			
		}
		
		else if (gender==null||gender == "" || gender.isEmpty()) {
			out.print("<p style='color:red;text-align:center;font-size:20px'>Gender  is empty </p>");
			
		}
		
		else if (qualification == "" || qualification.isEmpty()) {
			out.print("<p style='color:red;text-align:center;font-size:20px'>Qualification is empty </p>");
		}

		
		else if (language==null ||language.length == 0 ) {
			out.print("<p style='color:red;text-align:center;font-size:20px'>Language is empty </p>");
		}
		

		else {
			out.print("<div style='color:blue;border:solid;width:40%;padding:20px;margin:auto'>");
			out.print("<h1>User Information</h1>");
			out.print("<p>User Id : " + id);
			out.print("<p>User Name : " + name);
			out.print("<p>DOB : " + dob);
			out.print("<p>Gender : " + gender);
			out.print("<p>Phone : " + phone);
			out.print("<p>Qualification : " + qualification);
			
			out.print("<p>User Language : <ul>");

			for (String s : language) {
				out.print("<li>" + s);
			}
			out.print("</ul>");
			out.print("<p>Query String : " + request.getQueryString());
			out.print("<div>");
		}

	}

}
