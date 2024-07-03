
public class StringExample4 {

	public static void main(String[] args) {

		String s1 = "hello";

		System.out.println(s1.equals("HellO"));
		System.out.println(s1.equalsIgnoreCase("HellO"));

		String email = "coforge_ramkumar@ymail.com";
		System.out.println(email.startsWith("coforge"));
		
		if (email.startsWith("coforge")) {

			if (email.endsWith(".com")) {
				if (email.contains("@")) {
					System.out.println(email + " is valid email ");
				} else
					System.out.println("invalid email  doesnot have @ sign ");

			} else
				System.out.println("invalid email  doesnot ends with .com");

		} else {
			System.out.println("invalid email not starts with coforge ");
		}

	}
}
