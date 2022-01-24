class Test1{
protected	void info(String s) {
		System.out.println("hello");
	}
	static void show() {
		System.out.println("show in super class");
	}
}

public class Test2  extends Test1{

	@Override
//private 
// protected 
 //public 
 protected void info(String s) {
	 System.out.println("welcome ");
	}
	//@Override  //static method is inherited but cannot be overridden
	              // we can re write the static method in sub class 
	static void show() {
		System.out.println("show in sub class");
	}
	
	public static void main(String[] args) {
		new Test2().info("hello");
		Test1.show();
		Test2.show();
	}
}
