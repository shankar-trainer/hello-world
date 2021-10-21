package corejava;

public class StringDemo8 {

	public static void main(String[] args) {
		
		
		System.out.println("hello world".charAt(6));
		
		
		String city1="delhi";
		String city2="delhi";
		
		System.out.println(city1.compareTo(city2));
		
		city2="dblhi";
		System.out.println(city1.compareTo(city2));
		
		
		System.out.println("hello world".substring(5));
		System.out.println("hello world".substring(5, 9));
		
		
		
		String name="  mohan ";
		
		System.out.println(name.length());
		
		String trim = name.trim();
		
		System.out.println(trim+"-"+trim.length());
		
		
	}
}
