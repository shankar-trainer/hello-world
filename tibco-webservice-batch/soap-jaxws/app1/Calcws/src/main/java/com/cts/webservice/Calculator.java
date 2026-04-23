package com.cts.webservice;

import com.cts.exception.DivisionException;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface Calculator {

	@WebMethod
	public int addition(int a, int b);

	@WebMethod(operationName = "sub")
	public int subtraction(@WebParam(name = "firstno") int a, @WebParam(name = "secondno") int b);

	@WebMethod
	public int division(int a, int b) throws DivisionException;

}
