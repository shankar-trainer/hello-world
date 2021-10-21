
public class Example2 {

	static {

		System.out.println("static block");
	}

	{
		System.out.println("init  block");

	}

	public Example2() {
		System.out.println("constructor called");
	}

	int x;
	
	 void disp(){
		 
		 System.out.println(x);
	 }
	
	public static void main(String[] args) {
     Example2 example2=new Example2();
	//  System.out.println("x is "+x);
	}
}
