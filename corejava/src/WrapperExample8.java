
public class WrapperExample8 {

	public static void main(String[] args) {
		
		char c='a';
		Character p='a';
	
		System.out.println(p);
		System.out.println(Character.toUpperCase('p'));
		System.out.println(Character.toUpperCase(p));
		p='Z';
		System.out.println(p);
		System.out.println(Character.toLowerCase(p));
		
		if(Character.isAlphabetic(65))
			System.out.println("is alphabet");
		
		if(Character.isAlphabetic(48))
			System.out.println("48 code is alphabet");
		else
			System.out.println("48 code is not alphabet");
		
		System.out.println(Character.isLetter(c));
		c='1';
		System.out.println(Character.isLetter(c));
		System.out.println(Character.isDigit(c));
		
		System.out.println(Character.isLetterOrDigit(c));
		c='%';
		System.out.println(Character.isLetterOrDigit(c));
		if(!Character.isLetterOrDigit(c))
			System.out.println(c+"  it is special character ");
 	}
}
