package com.javacodegeeks.jaxws.example;


import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CalculatorI {
	@WebMethod
	int add(int a, int b);

	@WebMethod
	int subtract(int a, int b);

	@WebMethod
	int multiply(int a, int b);

	@WebMethod
	int divide(int a, int b);
}