
public class WrapperClass4 {

	public static void main(String[] args) {

		int p1 = Integer.valueOf("767676");
		Integer x = new Integer(1234);
		int p2 = Integer.valueOf(x);
		int p3 = Integer.parseInt("767676");

		
		System.out.println(Character.toUpperCase('x'));
		System.out.println(Character.toLowerCase('K'));
		
		char c='1';
		
		System.out.println(Character.isDigit(c));
		
		System.out.println(Character.isAlphabetic('a'));
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.isLetter('1'));
		System.out.println(Character.isLetter('&'));
		System.out.println(Character.isLetter('A'));
		
		System.out.println(Character.isLetterOrDigit('1'));
		System.out.println(Character.isLetterOrDigit('a'));
		System.out.println(Character.isLetterOrDigit('#'));
		
		//System.out.println(Character.isSpace('\t'));
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isWhitespace('\t'));
		System.out.println(Character.isWhitespace('\n'));
		
		
	}
}
