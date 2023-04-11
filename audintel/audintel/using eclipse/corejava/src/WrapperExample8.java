
public class WrapperExample8 {

	public static void main(String[] args) {
		
		char c='$';
		
		if(Character.isAlphabetic(c))
			 System.out.println(c+" is alphabet");
		else
			System.out.println(c+" is not alphabet");
			
		if(Character.isLetter(c))
			System.out.println(c+" is letter");
		else
		System.out.println(c+" is not letter");
		
		if(Character.isDigit(c))
			 System.out.println(c+" is digit");
		else
			System.out.println(c+" is not digit");
		
		
		if(Character.isLetterOrDigit(c))
			System.out.println(c+" is  eigher digit or letter");
		else
			System.out.println(c+" is special character");
		
		System.out.println(Character.toUpperCase('a'));
		System.out.println( ((char)(Character.toUpperCase(99))));
	
		System.out.println(Character.toUpperCase('%'));
	}
	
	
}
