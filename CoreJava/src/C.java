class B {
	int x = 10;
	void info() {
		System.out.println("hello");
	}
}

public class C extends B {

	int x = 100;

	@Override
	void info() {
	  System.out.println("greeting ");
	  super.info();
	}
	
	void disp() {
		int x = 1000;
		System.out.println("local " + x);
		System.out.println("current class x  " + this.x);
		System.out.println("super class x " + super.x);
	}

	public static void main(String[] args) {
		 C c=new C();
		 c.disp();
		 c.info();
	}
}
