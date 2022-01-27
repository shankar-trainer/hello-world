
public class StringPrg3 {

	public static void main(String[] args) {
		
		System.out.println("hello".equals("HeLLo"));
		
		System.out.println("hello".equalsIgnoreCase("HeLLo"));
		
		String var="learning java is now easy";
		System.out.println(var.substring(3));
		System.out.println(var.substring(3, 20));

		System.out.println(var.replace('a','z'));
		
		System.out.println(var.replaceAll("java","python"));
		
		
		char ar[]= {'h','e','l','l','o'};
		String s=String.valueOf(ar);
		System.out.println(s);
		
		
	}
}
