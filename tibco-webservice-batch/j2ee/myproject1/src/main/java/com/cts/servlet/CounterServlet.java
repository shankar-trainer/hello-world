package com.cts.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/counter")
@WebServlet(urlPatterns = { "/CounterServlet", "/counter" })
public class CounterServlet extends HttpServlet {

	int counter;

	@Override
	public void init() throws ServletException {
		System.out.println("init called...   ");
		counter = 1;
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print("count is " + counter++);
	}

}
