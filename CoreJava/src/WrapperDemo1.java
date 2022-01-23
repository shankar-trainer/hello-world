
public class WrapperDemo1 {

	public static void main(String[] args) {
		char c='a';
		System.out.println(Character.isAlphabetic(c));
		System.out.println(Character.isDigit(c));
		
		char c1='&';
		if(Character.isLetterOrDigit(c1))
			System.out.println("letter or digit ");
		else
			System.out.println("special character");
		System.out.println(Character.toUpperCase(c));
	}
}
