package org.com.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.com.webservice.exception.CustomerException;
import org.com.webservice.exception.TempException;
import org.com.webservice.model.Customer;

public class TestClient2 {

	public static void main(String[] args) throws MalformedURLException {
URL url=new URL
("http://localhost:8080/WebServiceDemo/hello?wsdl");		
QName qName=new QName("http://webservice.com.org/",
		"CustomerWebServiceImplService" );
Service service=Service.create(url, qName);
CustomerWebService customerWebService =	service.getPort
(CustomerWebService.class);
try {
 System.out.println("Enter customer id to be searched");
Customer customer=customerWebService.SearchCustomer(new Scanner(System.in).nextInt());
if(customer!=null){
System.out.println("Required customer found");
	System.out.println(customer.getId()+"\t"+customer.getName()+"\t"+customer.getLocation());
}
}
 catch (CustomerException e) {
	System.err.println(e.getMessage());
}
		
		
		
	}
	
}
