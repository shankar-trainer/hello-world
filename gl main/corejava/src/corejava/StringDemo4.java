package corejava;

public class StringDemo4 {

	public static void main(String[] args) {

		String var = "we are learning java";

		String ar[] = var.split(" ");

		for (String string : ar) {
			System.out.println(string);
		}

		var = "we-are-learning-java";

		System.out.println("2nd split");
		ar = var.split("-");

		for (String string : ar) {
			System.out.println(string);
		}

		String message = String.join(" and ", "Java", "is", "cool");

		System.out.println(message);

	}
}
