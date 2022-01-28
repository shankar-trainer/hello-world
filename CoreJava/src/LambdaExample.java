

public class LambdaExample {

	@FunctionalInterface
	interface Hello{
	void disp();   // functional interface must have single method 
    }
	
	public static void main(String[] args) {
		Hello hello=new Hello() {
			@Override
			public void disp() {
				System.out.println("hello1");
			}
		};
		
		Hello hello1=()->{
			System.out.println("hello 2.");
		};
		hello.disp();
		hello1.disp();
	}
}
