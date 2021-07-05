
public class StringEx1 {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "hello";

		System.out.println(s1.length());
		System.out.println(s1.charAt(4));

		System.out.println(s1.concat(" world"));
		System.out.println(s1.toUpperCase());

		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));

		String empId = "cts_565665";

		System.out.println(empId.startsWith("cts"));
		if (empId.startsWith("cts"))
			System.out.println(empId + " is valid ");
		else
			System.out.println("emp id is not valid ");

		String var1 = "we are learning java. java is important programming language ";

		System.out.println(var1.indexOf("java"));
		System.out.println(var1.lastIndexOf("java"));

		String email = "cts_ram@gmail.com";

		if (email.startsWith("cts") && email.endsWith(".com") && email.indexOf("@") > 0)
			System.out.println(email + " is valid");
		else
			System.out.println(email + " is not  valid");

	}

}
