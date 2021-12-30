import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.cognizant.ws.Calculator;

public class Client {

	public static void main(String[] args) throws MalformedURLException {

		URL url = new URL("http://localhost/calc?wsdl");

		QName qName = new QName("http://ws.cognizant.com/", "CalculatorImplService");

		Service service = Service.create(url, qName);
		Calculator calculator = service.getPort(Calculator.class);
		System.out.println(calculator.addition(11, 22));

	}
}
