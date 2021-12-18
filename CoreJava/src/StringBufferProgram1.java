
public class StringBufferProgram1 {

	public static void main(String[] args) {
		String s1 = "hi";
		s1.concat(" how are you");
		System.out.println(s1);
		s1.toUpperCase();
		System.out.println(s1);

		// StringBuffer buffer=""; // error
		StringBuffer buffer = new StringBuffer("hello"); // error

		// StringBuffer is mutable, it allows to make changes in the object
		
		buffer.append(" world");
		System.out.println(buffer);

		buffer.delete(2, 5);
		System.out.println(buffer);

		buffer.reverse();

		System.out.println(buffer);

		StringBuffer buffer1 = new StringBuffer("hello"); // error
		buffer1.insert(4, "  java");
		System.out.println(buffer1);

	}
}
