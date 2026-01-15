
public class Test2 {

	public static void main(String[] args) {
		int x=10;
		
//		if(x==11 && x++<12 ) {
			if(x==11 & x++<12 ) {
			System.out.println(x);
		}
		else {
			System.out.println("x is wrong");
		}
		System.out.println(x);
		
		int marks=56;
		
//		if(marks==56) 
//			System.out.println("pass");
//		else 
//			System.out.println("fail");
		
		
		String res=(marks==56?"pass":"fail");  // conditional operator 
		
		System.out.println(res);
		
	}
}
