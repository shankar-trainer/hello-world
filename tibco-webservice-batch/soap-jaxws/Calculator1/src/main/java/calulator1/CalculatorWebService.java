package calulator1;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface CalculatorWebService {
	@WebMethod
	public int add(int a, int b);

}
