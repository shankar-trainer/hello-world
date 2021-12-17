
public class StringExample2 {

	public static void main(String[] args) {

		String var = "ram goes to school";

		System.out.println(var.charAt(0));
		System.out.println(var.charAt(1));
		System.out.println(var.charAt(2));
		System.out.println(var.charAt(3));

		int pos = var.indexOf("a");

		if (pos >= 0) {
			System.out.println("found ");
		} else
			System.out.println("not found");
		

	}
}
