public class SbDEmo {

	public static void main(String[] args) {
		String s = "abc";
		s.concat(" xyz");
		System.out.println(s);
		// StringBuffer buffer="abc";
		StringBuffer buffer = new StringBuffer("abc");

		buffer.append(" pqr");
		System.out.println(buffer);
		buffer.reverse();
		System.out.println(buffer);

		buffer.insert(4, "  welcome ");
		System.out.println(buffer);

		buffer.delete(5, 8);
		System.out.println(buffer);

	}
}
