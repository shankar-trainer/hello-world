
public class StringOperation {

	public static void main(String[] args) {
		String var1 = "hello";

		System.out.println(var1);
		var1.concat("world");

		System.out.println();
		System.out.println(var1);

		var1 = var1.concat("world");

		System.out.println(var1);

		String s1 = "we are learning java";

		s1 = s1.toUpperCase();

		System.out.println(s1);

		s1 = s1.toLowerCase();

		String mail = "nec_emp1_ramkumar@hotmail.com";

		if (mail.startsWith("nec") && mail.endsWith(".com") && (mail.indexOf("@") >= 5)) {
			System.out.println("valid mail id ");
		} else {
			System.out.println("not valid mail id ");
		}

		String city = "mumbai";
		String city1 = "mumbai";
		System.out.println(city.compareTo(city1));

		city1 = "mumcai";
		System.out.println(city.compareTo(city1));

	}
}
