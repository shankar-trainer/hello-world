
public class CharactePrg1 {

	public static void main(String[] args) {

		char ch = '$';

		System.out.println(Character.isLetter(ch));
		System.out.println(Character.isLetterOrDigit(ch));
		System.out.println(Character.isDigit(ch));

		// if(!Character.isLetterOrDigit(ch) && !Character.isSpace(ch) )
		if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch))
			System.out.println(ch + " is special character");

		System.out.println("space " + Character.isWhitespace(ch));
	}
}
