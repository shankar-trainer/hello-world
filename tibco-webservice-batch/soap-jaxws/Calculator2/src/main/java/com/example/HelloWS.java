package com.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(serviceName = "HelloService")
public class HelloWS {

    @WebMethod(operationName = "sayHello")
    public String sayHello(String name) {
        return "Hello, " + name + " from GlassFish!";
    }
}
//http://localhost:8080/calculator1/HelloService?wsdl