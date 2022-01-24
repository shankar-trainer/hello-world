
public class WrapperDemo5 {

	public static void main(String[] args) {
		char c='x';
		System.out.println(Character.isDigit(c));
		System.out.println(Character.isLetter(c));
		
		char d='#';
		if(Character.isAlphabetic(d))
			System.out.println("alphabet");
		else if(Character.isDigit(c))
			System.out.println("is digit ");
		else
			System.out.println("special character");
			
		
		System.out.println(Character.isLetter(c));
		
	}
}
