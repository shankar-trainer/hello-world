
public class StringPoolExample {

	public static void main(String[] args) {
		
		System.out.println("hello"=="hello");
		System.out.println("hello".equals("hello"));
		System.out.println("hello"==new String("hello"));
		System.out.println("hello".equals(new  String("hello")));
	
		System.out.println("hello".equals("HellO"));//false 
		
		System.out.println("hello".equalsIgnoreCase("HellO"));
	}
}
