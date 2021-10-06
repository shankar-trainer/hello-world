import java.util.StringTokenizer;

public class StDemo1 {

	public static void main(String[] args) {

		String s1 = "we are learning java";

		StringTokenizer tokenizer = new StringTokenizer(s1);
		System.out.println("no of tokens " + tokenizer.countTokens());

		while (tokenizer.hasMoreTokens()) {
			String s = tokenizer.nextToken();
			System.out.print(s + "  ");
		}
		System.out.println();
		s1 = "we=are=learning=java";
		tokenizer = new StringTokenizer(s1, "=");
		while (tokenizer.hasMoreTokens()) {
			String s = tokenizer.nextToken();
			System.out.print(s + "  ");
		}
	}
}
