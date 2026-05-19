
public class MyOuter1 {
	int x, y;
    String s=Inner.city;
    
	public MyOuter1(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	static class Inner {// nested class 
		static String city;

		static int addition(int a, int b) {
			return a + b;
		}
	}

	public static void main(String[] args) {
	//	Inner inner = new Inner();
		MyOuter1 myOuter1 = new MyOuter1(10,20);

		System.out.println("addition of "+myOuter1.x+" and "+myOuter1.y+" is "+Inner.addition(myOuter1.x, myOuter1.y));
		
	}
}
