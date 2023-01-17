package com.pathinfotech;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class User1InfoServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
   	 @Override
   	public void init() throws ServletException {
   	 System.out.println("init called ");
   	}
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("service  called");
	}

	@Override
	public void destroy() {
		System.out.println("destroy called");

	}
}
