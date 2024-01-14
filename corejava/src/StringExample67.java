import java.util.Scanner;

public class StringExample67 {

	public static void main(String[] args) {
		
		String name=" shyam ";
		
		System.out.println(name.trim().equals("shyam"));
		
		System.out.println(name.length());
		System.out.println(name.trim().length());

		String s1="we are learning java. java is object oriented";
		
		// replace method replace the character
		System.out.println(s1.replace('e', 'x'));
		
		// replaceAll replace the string with another string
		System.out.println(s1.replaceAll("java", "python"));
		
		String country="";
		if(country.length()==0)
			System.out.println("it is blank");
		
		if(country.isEmpty())
			System.out.println("it is empty");
        
		country="  ";		
		if(country.isEmpty())
			System.out.println("..it is empty"); //it will not work
		
		// isBlank checks the length is 0 or it contains white spaces 
		if(country.isBlank())
			System.out.println("it is blank");
		
		
		
	}
}
