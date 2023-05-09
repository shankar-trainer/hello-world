package edu.chitkara;

public class StringMethodIndex {

	public static void main(String[] args) {

		// indexOf() -- gives the position of search value

		String var = "we are learning java. java is in good demand";
		int indexOf = var.indexOf('e');
		if (indexOf >= 0)
			System.out.println("found at " + indexOf);

		indexOf = var.indexOf("java");
		if (indexOf >= 0)
			System.out.println("found at " + indexOf);
  System.out.println("java present at last position "+var.lastIndexOf("java"));
	}
}
