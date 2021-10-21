package corejava;

public class StringTest2 {

	public static void main(String[] args) {

		System.out.println("abc" == "abc");

		System.out.println("abc" == new String("abc"));
		System.out.println("abc".equals(new String("abc")));

		System.out.println("hello".length());

		int ar[] = { 1, 2, 3, 4 };

		System.out.println(ar.length);

		System.out.println("hello".toUpperCase());

		System.out.println("ram".equals("Ram"));

		System.out.println("ram".equalsIgnoreCase("Ram"));

	}
}
