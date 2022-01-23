
public class StringDemo1 {

	
	public static void main(String[] args) {
		String a="hello";
		String b="  world";
		
		a.concat(b);// String is immutable 
		System.out.println(a);
		
		System.out.println(a.concat(b));
		
	}
}
