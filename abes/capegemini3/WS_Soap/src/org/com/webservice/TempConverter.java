package org.com.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.com.webservice.exception.TempException;

@WebService
public interface TempConverter {
	@WebMethod(operationName="CelcuisToFahrenheit")
	public String Cel_to_Fah(@WebParam(name="celcius_temp") float celcius) throws TempException;
	
	
}
