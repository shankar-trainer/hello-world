
public class Example1 {

	int p; // instance primitive variable

	String s;// instance reference variable

	static {
		System.out.println("static block is called");
	}

	private Example1() {
		System.out.println("constructor is called");
	}

	public static void main(String[] args) {
		int p1;// local primitive variable
		String name;// local reference variable
		int p;
		Example1 example1 = new Example1();
		Example1 example2 = new Example1();
		Example1 example3 = new Example1();
		Example1 example4 = new Example1();
	}
}
