
public class StringOperation3 {

	public static void main(String[] args) {
		
		String email="lpuemp_ram@gmail.com";
		
		if(email.startsWith("lpuemp"))
		System.out.println("vaild email  start with lpuemp ");
		else 
			System.out.println("invalid email");
		
		if(email.endsWith(".com"))
			System.out.println("vaild email  ends  with .com ");
		else 
			System.out.println("invalid email");
		
		if(email.endsWith(".com"))
			System.out.println("vaild email  ends  with .com ");
		else 
			System.out.println("invalid email");
		
		if(email.indexOf("@")>=5)
			System.out.println("vaild email  contains @sign  ");
		else 
			System.out.println("invalid email");
		
		
		
	}
}
