package com.javacodegeeks.jaxws.example;

import jakarta.annotation.Resource;
import jakarta.jws.WebService;
import jakarta.xml.ws.WebServiceContext;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.http.HTTPException;

import java.util.List;
import java.util.Map;


@WebService(endpointInterface = "com.javacodegeeks.jaxws.example.CalculatorI")
public class CalculatorImplAppManagedAuth implements CalculatorI {
	@Resource
    WebServiceContext context;

	@Override
	public int add(int a, int b) {
		if (isAuthenticated())
			return a + b;
		else
			throw new HTTPException(401);
	}

	@Override
	public int subtract(int a, int b) {
		if (isAuthenticated())
			return a - b;
		else
			throw new HTTPException(401);
	}

	@Override
	public int multiply(int a, int b) {
		if (isAuthenticated())
			return a * b;
		else
			throw new HTTPException(401);
	}

	@Override
	public int divide(int a, int b) {
		if (isAuthenticated())
			return a / b;
		else
			throw new HTTPException(401);
	}

	private boolean isAuthenticated() {
		MessageContext messageContext = context.getMessageContext();
		Map httpHeaders = (Map) messageContext.get(MessageContext.HTTP_REQUEST_HEADERS);
		List userNameList = (List) httpHeaders.get("uname");
		List passwordList = (List) httpHeaders.get("pass");

		if (userNameList.contains("saurabh") && passwordList.contains("java"))
			return true;
		else
			return false;
	}
}
