
public class WrapperDemo3 {

	public static void main(String[] args) {
		char c='A';
		System.out.println(Character.toUpperCase(c));
		
		System.out.println(Character.isDigit(c));// false
		System.out.println(Character.isAlphabetic(c));// true
		System.out.println(Character.isLetter(c));// true
		
		System.out.println(Character.isLetterOrDigit(c));// true
		
		c='@';
		
		System.out.println(Character.isLetterOrDigit(c));// false
		
		if(!Character.isLetterOrDigit(c))
			System.out.println(c+" is special character");
		
		String s1="hello world";
		for(char c1:s1.toCharArray())
			System.out.print(Character.toUpperCase(c1)+" ,");
	}
}
