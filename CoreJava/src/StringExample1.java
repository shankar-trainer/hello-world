
public class StringExample1 {

	public static void main(String[] args) {
		//String literal is object 
		
		String var="hello world";
		System.out.println(var.length());
		System.out.println(var.toUpperCase());
		
		String s1=var.toUpperCase();
		
		System.out.println(var);
		System.out.println(s1);
		
		System.out.println(var.toLowerCase());
		
		
		var.concat(" to java ");
		System.out.println(var);
		
		
		System.out.println(var.concat(" to java "));
		
	}
}
