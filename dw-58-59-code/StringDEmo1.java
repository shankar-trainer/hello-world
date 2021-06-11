
public class StringDEmo1 {

	public static void main(String[] args) {
		String var = "we are learning  java ";
		System.out.println(var.length());

		var = "hello world";

		System.out.println(var.charAt(0));
		System.out.println(var.charAt(1));

		System.out.println(var.toUpperCase());
		
		System.out.println(var.codePointAt(4));
		
		System.out.println(var.compareTo("hello world"));
		System.out.println(var.compareTo("jello world"));

		System.out.println(var.replace('l','p'));
		
		System.out.println(var.replaceAll("hello", "greeting"));
		
		
		var=" hello to java  ";
		
		System.out.println(var.length());
		

       System.out.println(var.trim().length());
       
		
	}
}


