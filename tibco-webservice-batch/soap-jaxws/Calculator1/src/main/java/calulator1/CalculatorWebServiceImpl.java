package calulator1;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(serviceName = "calc")
public class CalculatorWebServiceImpl implements CalculatorWebService {
	@WebMethod
	public int add(int a, int b) {
		return a + b;
	}
}
//http://localhost:8080/calculator1/calc?wsdl
	
