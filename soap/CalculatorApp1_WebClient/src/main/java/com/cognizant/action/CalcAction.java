package com.cognizant.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.cognizant.ws.Calculator;

@WebServlet("/CalcAction")
public class CalcAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		URL url = new URL("http://localhost:8080/CalculatorApp1/hello?wsdl");

		QName qName = new QName("http://ws.cognizant.com/", "CalculatorImplService");
		Service service = Service.create(url, qName);
		
 Calculator calc=service.getPort(Calculator.class);
       
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

	int x = Integer.parseInt(request.getParameter("no1"));
	int y = Integer.parseInt(request.getParameter("no2"));

	String operation = request.getParameter("operation");

		switch (operation) {
		case "Addition":
            out.print("<br>Addition of "+x+" and "+y+" is "+calc.addition(x,y));
			break;
			
		case "Subtraction":
			out.print("<br>Subtraction of "+x+" and "+y+" is "+calc.subtraction(x,y));
			break;
			
		case "Multiplication":
			out.print("<br>Multiplication of "+x+" and "+y+" is "+calc.multiplicaation(x,y));
			break;
			
		case "Division":
			out.print("<br>Division of "+x+" and "+y+" is "+calc.division(x,y));
			break;

		default:
			break;
		}
	}

}
