
public class Grade {

	public static void main(String[] args) {
		
		float marks=56.78f;
		
		if(marks>=35)
			System.out.println("pass");
		else 
			System.out.println("fail");
		
		// ternary operator
		
		String s=(marks>=35?"pass":"fail");
		
		System.out.println(s);
		
		marks=23;
		System.out.println(marks>=35?"pass":"fail");
		
	}
}
