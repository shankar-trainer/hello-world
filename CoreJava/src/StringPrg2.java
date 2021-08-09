import java.util.Scanner;

public class StringPrg2 {

	public static void main(String[] args) {

		String mail = "ramkumar@montran.com";

		 mail=new Scanner(System.in).next();
		 
		if (mail.contains("@")) {
			if (mail.endsWith(".com")) {
				System.out.println("mail is valid ");
			} else
				System.out.println("mail does not ends with .com");
		} else
			System.out.println("mail has no @ sign ");

		String empId = "Mortran_emp_100001";

		if (empId.startsWith("Mortran"))
			System.out.println("valid id");
		else
			System.out.println("id is not valid");
		
		
		String country=" india ";
		System.out.println(country.length());
		System.out.println(country.trim().length());

	}
}
