package org.com.webservice;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.com.webservice.exception.TempException;

public class TestClient {

	public static void main(String[] args) throws MalformedURLException {
		URL url=new URL
		("http://localhost:8080/WebServiceDemo/hello?wsdl");		
QName qName=new QName("www.abc.com","TempConverterImplService" );
Service service=Service.create(url, qName);
TempConverter converter=	service.getPort(TempConverter.class);
try {
	System.out.println(converter.Cel_to_Fah(-45));
} catch (TempException e) {

	System.err.println(e.getMessage());
}
		
		
		
	}
	
}
