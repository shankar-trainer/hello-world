
public class StringExample1 {

	public static void main(String[] args) {
		String s = "hello";

		System.out.println(s);
		System.out.println(s.concat(" world"));
		s = s.concat(" of java ");
		System.out.println(s);
		s = s.toUpperCase();
		System.out.println(s);
		
		
		System.out.println(s.length());
		
		String var1="java";
		String var2="java";
		
		System.out.println(var1.equals(var2));
		System.out.println(var1.compareTo(var2));
		var2="kava";
		System.out.println(var1.compareTo(var2));
		var2="jaya";
		System.out.println(var1.compareTo(var2));
		System.out.println(var2.compareTo(var1));

	}
}
