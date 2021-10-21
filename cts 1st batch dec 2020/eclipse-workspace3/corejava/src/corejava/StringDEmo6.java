package corejava;

public class StringDEmo6 {

	public static void main(String[] args) {

		String var = "java is hot in the market. we learn java";

		String var1 = var.replace('j', 'a');
		System.out.println(var1);

		String replaceAll = var.replaceAll("java", "python");

		System.out.println(replaceAll);

		String replaceFirst = var.replaceFirst("java", "python");

		System.out.println(replaceFirst);

		System.out.println(var.replaceAll("\\s[a-z][a-z]\\s", " nodejs "));
		
		
	}
}
