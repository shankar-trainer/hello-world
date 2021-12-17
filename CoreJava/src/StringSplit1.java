
public class StringSplit1 {

	public static void main(String[] args) {
		String var = "we-are-learning-java";

		String ar[] = var.split("-");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		var="i-@am&-fine&@how-@are-you";
		System.out.println("===================\n");
		ar = var.split("-@|&-|-|-@|&@");
		
		for (String string : ar) {
			System.out.println(string);
		}
	}
}
