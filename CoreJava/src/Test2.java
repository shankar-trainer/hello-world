class Test1{
	void info() {
		System.out.println("hello");
	}
}

public class Test2  extends Test1{

	@Override
	void info() {
	 System.out.println("welcome ");
	}
	
	public static void main(String[] args) {
		new Test2().info();
	}
}
