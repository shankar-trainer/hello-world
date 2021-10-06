package exception;

public class Client {

	public static void main(String[] args) {
		try{
		Server server=new Server();
		
		server.divide(10, 0);
		}
		catch (Exception e) {
			   System.err.println("at client error is "+e.getMessage());
		}
	}
}
