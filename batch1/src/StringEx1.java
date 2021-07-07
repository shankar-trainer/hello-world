
public class StringEx1 {

	public static void main(String[] args) {

		String s1 = "we are learning java";
		String s2 = "we are learning java";
		if (s1.equals(s2))
			System.out.println("s1 equals s2");
		System.out.println(s1.length());
		System.out.println(s2.length());

		System.out.println(s1.compareTo(s2));

		String var = "hello";
		var = var.concat("world");
		System.out.println(var);

		System.out.println(var.concat("world"));

		System.out.println(s1.charAt(3));

		char c[] = s1.toCharArray();
		for (char d : c) {
			System.out.print(d + " , ");
		}
		System.out.println();
		
		System.out.println(s1.toUpperCase());

	}

}
