
public class StringOperation4 {

	public static void main(String[] args) {
		String s1="hello";
		String s2="world";
		
		System.out.println(s1+"  "+s2);
		System.out.println(s1.concat("   ").concat(s2));
		
		String s3="greeting to the java";
		
		System.out.println(s3.substring(3));
		System.out.println(s3.substring(3,10));
		
		System.out.println(s3.replace('e', 'm'));
		System.out.println(s3.replaceAll("java", "python"));
		
		String name=" ram kumar ";
		System.out.println(name.length());
		System.out.println(name);
		System.out.println(name.trim());
		System.out.println(name.trim().length());

		String k1=String.valueOf(true);
		String k2=String.valueOf(123);
		String k3=String.valueOf('a');
	    
	    System.out.println("hello".codePointAt(0));
	    System.out.println("hello".codePointAt(1));
	    System.out.println("hello".codePointAt(2));
       	    
	}
}
