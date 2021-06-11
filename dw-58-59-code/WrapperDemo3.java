
public class WrapperDemo3 {

	public static void main(String[] args) {

		System.out.println(Character.toUpperCase('c'));
		System.out.println(Character.toLowerCase('c'));
		
		char ch='1';
		
		if(Character.isLetter(ch))
			System.out.println(ch +" is letter");
		
		if(Character.isDigit(ch))
			System.out.println(ch +" is digit");
		
		ch='$';
		
		if(!Character.isLetterOrDigit(ch))
			System.out.println(ch +" is special character ");
		
	}
}
