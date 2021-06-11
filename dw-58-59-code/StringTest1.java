
public class StringTest1 {

	public static void main(String[] args) {
		String var="we are learning java. java is a programming language";
		
		System.out.println(var.indexOf("java"));
		System.out.println(var.lastIndexOf("java"));
		
		
		System.out.println(var.substring(10));
		System.out.println(var.substring(4,15));
		
		String s1="hello";
		s1.concat("world");
		
		System.out.println(s1);
		System.out.println(s1.concat("world"));
		
		
	String s9=	String.valueOf(43434.56f);
	String s10=	String.valueOf(434);
	String s11=	String.valueOf(4343667677L);
	
	System.out.println(s9);
	
	String bin= Integer.toBinaryString(123);
	String oct= Integer.toOctalString(45455);
	 
	System.out.println(bin);
	System.out.println(oct);
	
		
	}
}
