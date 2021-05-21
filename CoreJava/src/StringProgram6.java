
public class StringProgram6 {

	public static void main(String[] args) {

		String var = "we are learning java. we are learning java8  ";

		String s1 = var.replace('a', 'z');
		System.out.println(s1);

		 s1 = var.replaceAll("java", "angular");
		System.out.println(s1);
		
		String s="";
		
		if(s.length()==0)
			System.out.println("it is empty");
		
		if(s.isEmpty())
			System.out.println("it is empty.. ");

		String city1="delhi";
		String city2="denhi";
		
		if(city1.contentEquals(city2)) {
			System.out.println("contents are equals ");
		}
		
		String ss=" hello ";
		System.out.println(ss.length());
		System.out.println(ss.trim().length());
		
		System.out.println(var.substring(6));
		System.out.println(var.substring(6,10));
		
		System.out.println("hello".concat("world"));
		
		String s11="hello";
		s11=s11.concat("world");
		System.out.println(s11);
		
	}
}
