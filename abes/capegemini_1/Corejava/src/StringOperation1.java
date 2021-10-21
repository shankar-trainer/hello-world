public class StringOperation1 {

	public static void main(String[] args) {
		String var = "we are mearning java";
		String var1 = "we are learning java";

		System.out.println(var.compareTo(var1));

		System.out.println(var.charAt(4));
		System.out.println(var.codePointAt(4));

		String mail = "abes_ram@gmail.com";

		if (mail.startsWith("abes")) {
			if (mail.endsWith(".com")) {
				System.out.println("valid mail id");
			} else
				System.out.println("mail id does not end with .com");
		}
		else
		System.out.println("mail id does not starts with abes");

	}
}
