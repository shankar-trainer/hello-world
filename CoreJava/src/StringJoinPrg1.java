
public class StringJoinPrg1 {

	public static void main(String[] args) {
		
		String ar[]= {"hello","world","to","java"};
						
		String join = String.join("-", ar);
		System.out.println(join);
		
		
		
		System.out.println("hello".equals("hello"));
		System.out.println("hello".equals("HeLlo"));
		System.out.println("hello".equalsIgnoreCase("HeLlo"));
		
		
	}
}
