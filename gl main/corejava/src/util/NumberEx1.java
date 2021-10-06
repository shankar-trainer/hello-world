package util;

import java.io.Console;
import java.text.NumberFormat;

public class NumberEx1 {

	public static void main(String[] args) {
		
      Console console=System.console();

      System.out.println("Enter name");
      String name=console.readLine();
      
      System.out.println("Enter password");
      char  pass[]=console.readPassword();
      
      console.format("name is %26s", name);
      console.format("\npassword is %s", new String(pass));
      
      
		
      float salary=12345.6678f;
      
      System.out.printf("\n%f",salary );
      System.out.printf("\n%.2f",salary );
      System.out.printf("\n%20.2f",salary );
      
		
	}
	
}
