package com.cognizant.ws;

import javax.jws.*;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

//http://localhost:8080/CalculatorApp1/hello?wsdl

@WebService(endpointInterface = "com.cognizant.ws.Calculator")
@BindingType(value = SOAPBinding.SOAP11HTTP_BINDING)
public class CalculatorImpl  implements  Calculator {

	@WebMethod(operationName = "mathAddition")
	public int addition(int a, int b) {
		return a+b;
	}

	@WebMethod(operationName = "mathSubtraction")
	public int subtraction(@WebParam(name = "no1")  int a, 
			@WebParam(name = "no2") int b) {
		return a-b;
	}

	public int multiplicaation(int a, int b) {
		return a*b;
	}

	public int division(int a, int b) {
		return a/b;
	}

}
