
public class StringOperation {

	public static void main(String[] args) {
		String var="we are learning java";
		String var1="we are learning java";
		
		System.out.println(var.length());
		System.out.println(var.equals(var1));
		
		String s1=var.toUpperCase();
		System.out.println(s1);
		// search indexOf
		String var2="we are learning java.IT industry uses java more";
		
		int pos=var2.indexOf("java");
		if(pos>=0)
			System.out.println("found at "+pos);
		else 
			System.out.println("not found");
		System.out.println(var2.indexOf('a'));
		System.out.println(var2.lastIndexOf("java"));
		
		char c=var2.charAt(17);
		System.out.println(c);
		
	char c1[]=	var2.toCharArray();
	
	String p1=var2.replace('i', 'K');
	System.out.println(p1);

	String p2=var2.replace("java", "python");
	System.out.println(p2);
	
	String p3=var2.replaceAll("java", "python");
	System.out.println(p3);
			
	}
}
