
public class StringExample5 {

	public static void main(String[] args) {

		String var = "we are learning java";

		String[] split = var.split(" ");

		for (String string : split)
			System.out.println(string);

		System.out.println("\nsplit using - delimiter ");
		
		String var2 = "we-will-learn-spring";
		split = var2.split("-");
		for (String string : split)
			System.out.println(string);

		System.out.println("\n\n using multiple delimiter \n");

		var2 = "we-will&learn-spring.spring@boot-is&also-in@our course";

		split = var2.split("-|@|&| ");
		for (String string : split)
			System.out.println(string);

	}
}
