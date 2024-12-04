
public class If {

	public static void main(String[] args) {
		float marks=45;
		
		if(marks>=35)
			System.out.println("pass ");
		else 
			System.out.println("fail ");
		
		String result =(marks>=35?"pass":"fail");
		System.out.println(result);
		
		System.out.println((marks>=35?"pass":"fail"));
		
	}
}
