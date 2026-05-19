package test;

class b {
	static void hello() {
		System.out.println("hello1");
	}
	
}
public class a  extends b{

	//@Override
	// re writing of method  
	static void hello() {
		 System.out.println("hello2");
	 }
	 
	 public static void main(String[] args) {
	hello();	
	}
}
