
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.abc.Welcome;

public class Client {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:8080/SoapApp1/hello?WSDL");
		QName name = new QName("http://abc.com/", "WelcomeImplService");

		Service service = Service.create(url, name);
		int x = 6;
		Welcome welcome = service.getPort(Welcome.class);
		System.out.println(welcome.hello("kamal kumar"));
		System.out.println(x + " factorial is " + welcome.factorial(x));

	}
}