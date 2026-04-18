package com.example.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class HelloWorld {
    @WebMethod
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
//http://localhost:8080/ws2/hello?wsdl