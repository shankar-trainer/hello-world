
public class WrapperCharacter {

	public static void main(String[] args) {
		//char c='a';
		char c='1';
		System.out.println(Character.isDigit(c));
		System.out.println(Character.isLetter(c));
		
		System.out.println(Character.isLetterOrDigit(c));
		
		char c1='$';
		if(!Character.isLetterOrDigit(c1))
		   System.out.println("special char");
		else
			System.out.println("digit or letter");
		
	}
}
