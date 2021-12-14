import javax.xml.ws.Endpoint;

import com.abc.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator calculator=new Calculator();
		
		Endpoint endpoint=Endpoint.publish
				("http://localhost/calculator", calculator);
	//http://localhost/calculator?wsdl	
	}
}
