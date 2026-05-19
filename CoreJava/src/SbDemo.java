
public class SbDemo {

	public static void main(String[] args) {
		String s = "hello";
		s.concat("world");
		System.out.println(s);

//		StringBuffer buffer="greeting";
		StringBuffer buffer = new StringBuffer("greeting");

		buffer.append(" to my friend");
		System.out.println(buffer);

		buffer.insert(3, "  hi how are u  ");

		System.out.println(buffer);

		buffer.delete(3, 15);
		System.out.println(buffer);

		System.out.println(buffer.reverse());
		

	}
}
