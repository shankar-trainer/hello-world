
public class StringOperation2 {

	public static void main(String[] args) {
		String var="we are learning java. java is used everywhere  in it market";
		
		int pos=var.indexOf("java");
		if(pos>=0)
			System.out.println("found at "+pos);
		else 
			System.out.println("not found ");
		
		System.out.println(var.lastIndexOf("java"));
		
		String s1="hello";
		String s2="hello";
		String s3="hElLo";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		String city1="delhi";
		String city2="delhi";
		String city3="delai";
		
		System.out.println(city1.compareTo(city2));
		System.out.println(city1.compareTo(city3));
		
	}
}
