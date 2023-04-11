
public class StringExample6 {

	public static void main(String[] args) {

		String var1 = "we are learning java.after java we will learning spring boot.java is used widely";
		System.out.println(var1.replace('a', 'z'));

		String replaceAll = var1.replaceAll("java", "sql");

		System.out.println(replaceAll);

		String name = " surendra kumar ";

		System.out.println(name.length());

		name = name.trim();
		System.out.println(name.length());

		char ar1[] = { 'p', 'y', 't', 'h', 'o', 'n' };

		String p1 = String.valueOf(ar1);
		System.out.println(p1);

		p1=String.valueOf(ar1, 2, 4);
		
		System.out.println(p1);
		
	   System.out.println(name.codePointAt(0));
	   System.out.println(name.codePointAt(1));
	   System.out.println(name.codePointAt(2));
	   
	   
	}
}
