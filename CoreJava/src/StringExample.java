
public class StringExample {

	public static void main(String[] args) {
		String s = "hello"; // object1
		System.out.println(s.length());
		System.out.println(s);
		s.concat(" world");
		s.toUpperCase();

		System.out.println(s);
		System.out.println(s.toUpperCase());
		System.out.println(s.concat("world"));
		System.out.println(s);

		s = s.concat(" to java ");// object 2

		System.out.println(s);

		System.out.println("==========");

	}
}
