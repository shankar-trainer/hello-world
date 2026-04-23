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

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
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
		out.println(calculator.addition(11, 12));
		out.println(calculator.sub(11, 12));

		try {
			out.println(calculator.division(11, 12));
			out.println(calculator.division(11, 0));
		} catch (DivisionException_Exception e) {
			out.println(e.getMessage());
		}

	}
}
