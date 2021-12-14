package com.abc;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Client {
public static void main(String[] args) throws MalformedURLException {
	URL url=new URL("http://localhost:9090/SoapApp1-0.0.1-SNAPSHOT/hello?WSDL");
	QName name=new QName("http://abc.com/","WelcomeImplService");
	
	Service service=Service.create(url,name);
	
	Welcome welcome = service.getPort(Welcome.class);
	System.out.println(welcome.hello("kamal kumar"));
	
}
}
