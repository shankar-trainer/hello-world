
public class StringExample6 {

	public static void main(String[] args) {
		
		String s1="hello";
		
		String concat = s1.concat("world");
		
		System.out.println(s1);
		System.out.println(concat);
		
		System.out.println(concat.replace('o', 'x')); // replace -- will replace old char with new char 
				
		// replaceAll()--  it replace one word with other word
		
		
		String var="we are learning java. with java we will learn spring and spring boot ";
		
		var=var.replaceAll("java", "javascript");
		System.out.println(var);
		
		String name=" ram kumar  ";
		System.out.println(name+"  "+name.length());
		name=name.trim();
		
		System.out.println(name+"  "+name.length());
		
		
	}
}
