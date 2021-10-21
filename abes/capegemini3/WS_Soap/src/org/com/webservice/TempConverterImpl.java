package org.com.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.com.webservice.exception.TempException;

@WebService(endpointInterface="org.com.webservice.TempConverter", 
targetNamespace="www.abc.com", name="myservice")
public class TempConverterImpl implements TempConverter {
	
	@Override
	public String Cel_to_Fah(   float celcius) throws TempException {
		if(celcius<=0)
			throw new TempException("temperature is -ve or zero");
	return celcius+" in Fahrenheit is "+(9/5*celcius+32);
	}

}
