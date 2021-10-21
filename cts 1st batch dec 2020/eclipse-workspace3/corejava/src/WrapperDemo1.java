
public class WrapperDemo1 {

	public static void main(String[] args) {

		Character character = new Character('a');

		System.out.println(Character.toUpperCase('a'));

		char ch = '&';

		if (Character.isDigit(ch))
			System.out.println("is digit");

		if (Character.isLetter(ch))
			System.out.println("is letter");

		if (Character.isLetterOrDigit(ch))
			System.out.println("is letter or digit ");

		if (!Character.isLetterOrDigit(ch))
			System.out.println(ch + " is special char ");

	}
}
