package regex;

public class Test2 {

	public static void main(String[] args) {
		
		String s="we are learning java";
		
		System.out.println(s.matches("^we.*java$"));
		
		// starts with capital letter and end with .?!

		 s="We are learning java?python is easy";
 
		System.out.println(s.matches("^[A-Z].*[?.!]$"));
		
		System.out.println("result ");
		
		String arg[]=s.split("[\\?]");
		
		for (String string : arg) {
			System.out.println(string);
		}
		
		s="i am born at 2001";
		
		System.out.println(s.replaceAll("[0-9]","-"));
			
	}
	
}
