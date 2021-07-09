
public class StringEx1 {

	public static void main(String[] args) {
		System.out.println("abc"=="abc");
		System.out.println("abc"==new String("abc"));
		
		
		System.out.println("abc".equals("abc"));
		System.out.println("abc".equals(new String("abc")));
		
	}
}
