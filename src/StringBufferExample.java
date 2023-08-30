
public class StringBufferExample {

	public static void main(String[] args) {
		String s1 = "hello";
		System.out.println(s1);
		s1.concat(" world");
		System.out.println(s1);

		// StringBuffer buffer="hello"; // error
		// StringBuffer does not accept string literal;

		StringBuffer buffer = new StringBuffer("welcome");
		System.out.println(buffer);
		buffer.append(" to java ");
		System.out.println(buffer);

		buffer.insert(3, "  hi.... ");
		System.out.println(buffer);

		buffer.delete(5, 8);
		System.out.println(buffer);
		buffer.deleteCharAt(2);
		System.out.println(buffer);

		StringBuffer buffer1 = new StringBuffer("malayalam");
		String original = buffer1.toString();

		if (buffer1.reverse().equals(buffer1))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");

	}
}
