
public class StringPrg1 {

	public static void main(String[] args) {
		String s1="greeting";
		String s2="greeting";
		String s3="hello";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));
		
		System.out.println("delhi".compareTo("delhi"));
		System.out.println("delhi".compareTo("delpi"));
		
		System.out.println(s1.charAt(6));
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
   
		String var="we are learning java. java is not easy";
		
		System.out.println(s1.indexOf("t"));
		System.out.println(var.indexOf("java"));

		System.out.println(var.lastIndexOf("java"));
		System.out.println(s1.indexOf("z"));
		
	}
}
