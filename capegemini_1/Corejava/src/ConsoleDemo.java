import java.io.Console;

public class ConsoleDemo {

	public static void main(String[] args) {
		
		Console console=System.console();
		System.out.println("Enter name");
		
		String name=console.readLine();
		
		System.out.println("\nEnter password");
		char pass[]=console.readPassword();

		console.printf("name is %s", name);
		console.printf("\npassword is %s", pass);
	 	
	}
}




