package ws;

public class main {

	public static void main(String[] args) {
		HelloWorldService service = new HelloWorldService();
		HelloWorld helloWorld = service.getHelloWorldPort();
		System.out.println(helloWorld.sayHello("welcome to ws"));

	}

}
