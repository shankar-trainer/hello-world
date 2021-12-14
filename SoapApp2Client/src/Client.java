import com.abc.Welcome;
import com.abc.WelcomeImplService;

public class Client {
//wsimport -keep http://localhost:8080/SoapApp1/hello?WSDL
	public static void main(String[] args) {
		WelcomeImplService service = new WelcomeImplService();

		Welcome welcomeImplPort = service.getWelcomeImplPort();

		System.out.println(welcomeImplPort.factorial(5));
		System.out.println(welcomeImplPort.hello("rohan kumar"));
	}
}
