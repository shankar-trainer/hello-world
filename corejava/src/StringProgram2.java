
public class StringProgram2 {

	public static void main(String[] args) {

		String email = "emp_ram@coforge.com";

		if (email.startsWith("emp")) {
			if (email.indexOf("@") >= 0) {
				if (email.endsWith(".com"))
					System.out.println(email + " is valid ");
				else
					System.out.println("invalid email does not ends with .com");
			} else
				System.out.println("invalid email does not contain @ sign");
		} else
			System.out.println("invalid email does not starts with  emp");
	}

}
