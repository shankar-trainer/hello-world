class B {
	int x = 100;

	void show() {
		System.out.println("B class show method ");
		System.out.println("class name is " + getClass().getName());
	}
	static void hello() {
		System.out.println(" hello static method ..");
	}
}

public class C extends B {

	int x = 1000;

	//@Override
	  // 
	static void hello(){
		System.out.println("hello static method in sub class");
		//super.hello();  // error 
	}
	
	@Override
	void show() {
		int x = 10000;
		System.out.println("local x " + x);
		System.out.println("current class  x " + this.x);
		System.out.println("super  class  x " + super.x);
		super.show();
	}

	public static void main(String[] args) {
		new C().show();
		hello();
	}
}
