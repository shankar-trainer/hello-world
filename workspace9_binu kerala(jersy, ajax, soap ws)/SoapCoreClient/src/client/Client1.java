package client;

public class Client1 {


	public static void main(String[] args) {
		
		WelcomeImplService service=new WelcomeImplService();
		WelcomeImpl  welcomeImpl=service.getWelcomeImplPort();
	
		
	String res=	welcomeImpl.hello("mohan  kumar");
		
	System.out.println(res);
	}
	
}
