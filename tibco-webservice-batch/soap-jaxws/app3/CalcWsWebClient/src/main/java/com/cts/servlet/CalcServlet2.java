package com.cts.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.cts.webservice.Calculator;
import com.cts.webservice.CalculatorImplService;
import com.cts.webservice.DivisionException_Exception;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calc2")
public class CalcServlet2 extends HttpServlet {
	CalculatorImplService service;
	Calculator calculator;

	@Override
	public void init() throws ServletException {
		service = new CalculatorImplService();
		calculator = service.getCalculatorImplPort();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		resp.setContentType("text/html");
		int a = Integer.parseInt(req.getParameter("n1"));
		int b = Integer.parseInt(req.getParameter("n2"));

		out.println("addition is " + calculator.addition(a, b));
		out.println("<br>subtraction is " + calculator.sub(a, b));

		try {
			out.println("<br>division is " + calculator.division(a, b));
		} catch (DivisionException_Exception e) {
			out.println("<br>"+e.getMessage());
		}

	}
}
