
public class StringProgram {

	public static void main(String[] args) {
		
		String s="hello world to java we will learn advance java too";
		int p=s.indexOf("java");
		
		System.out.println(p);
		System.out.println(s.lastIndexOf("java"));
		
		System.out.println(s.lastIndexOf("welcome"));
		
		p=s.lastIndexOf("happy");
		if(p>=0)
			System.out.println("at "+p+" found ");
		else 
			System.out.println("not found");
		
		char c1=s.charAt(0);
		char c2=s.charAt(1);
		char c3=s.charAt(2);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(s.replace('l', 'x'));// replace char by char
		System.out.println(s.replaceAll("java", "nodejs"));
		               // replaceAll replace string by string
	}
}
