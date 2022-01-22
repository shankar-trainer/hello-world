
public class StringExample1 {

	public static void main(String[] args) {

		String var = "hello";// refers 1 object , immutable

		System.out.println(var);
		var.concat("world"); // immutable (not modifiable)
		System.out.println(var);

		String s1 = "Cat"; // String pool
		String s2 = "Cat";// both s1, s2 refers same object in String pool

		String s3 = new String("Cat");// not inside String pool, outside string pool has different object
										// s1 and s3 refers different objects
		// == for checking references
		// .equals -- for checking contents

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

		System.out.println("hello" == "hello");  // true  string pool
		System.out.println("hello" == new String("hello"));// false
		System.out.println("hello".equals(new String("hello")));// true

	}
}
