
public class SpringExample7 {

	public static void main(String[] args) {
		String var = "we are learning java";
		String[] split = var.split(" ");

		for (String string : split) {
			System.out.println(string);
		}

		String var1 = "ram-goes-to-school";

		split = var1.split("-");

		System.out.println("======================\n");
		for (String string : split) {
			System.out.println(string);
		}

		String var2 = "java-is&not-easy.learn-java&seriously";
		
		split = var2.split("-|&|\\.");
		
		System.out.println("======================\n");
		for (String string : split) {
			System.out.println(string);
		}
		
	}
}
