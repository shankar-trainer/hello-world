
public class StringEx2 {

	public static void main(String[] args) {
		String var = "we are learning java. java is oop based";
		String var1 = "we are learning java. java is oop based";

		System.out.println(var.length());
		System.out.println(var.concat("  ..........  hi "));
		System.out.println(var.toUpperCase());

		System.out.println(var.indexOf("java"));
		System.out.println(var.lastIndexOf("java"));

		System.out.println(var.substring(4));
		System.out.println(var.substring(4, 20));
		System.out.println(var.equals(var1));

		System.out.println(var.compareTo(var1));

		System.out.println(var.replace('e', 'q'));
		System.out.println(var.replaceAll("java", "python"));

		String email = "cts_ramkumar@gmail.com";

		System.out.println(email.startsWith("cts"));
		System.out.println(email.endsWith("com"));
		System.out.println(email.indexOf("@"));

		if (email.startsWith("cts") && email.endsWith(".com") && email.indexOf("@") > 0)
			System.out.println("valid email ");
		else
			System.out.println("invalid 		email");

		char ar[] = email.toCharArray();
		for (char c : ar) {
			System.out.print(c + " ");
		}

		String var2 = "we are leaning java";
		String ar2[] = var2.split(" ");
		System.out.println("after split ");
		for (String string : ar2) {
			System.out.print(string + " , ");
		}

		var2 = "we-all-are-indian";

		ar2 = var2.split("-");
		System.out.println("after split\n ");
		for (String string : ar2) {
			System.out.print(string + " , ");
		}

		var2 = "i=-know-where-=are-you";

		ar2 = var2.split("-|=");
		System.out.println("after new split\n ");
		for (String string : ar2) {
			System.out.print(string + " , ");
		}

		String ar5[] = { "delhi", "kolkotta", "mumbai", "chennai" };

		String join = String.join(" and ", ar5);
		System.out.println();
		System.out.println(join);
	}
}
