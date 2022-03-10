class X{
	public X() {
		super();
		System.out.println("x constructor ");
	}	
}

class Y extends X{
	public Y() {
		//super();  // super() keyword is added by the compiler and super() calls the super class constructor 
		System.out.println("Y constructor ");
	}	
}

public class Z  extends Y {

	public Z() {
		super();
	System.out.println("z constructor ");
	}
	public static void main(String[] args) {
		new Z();
	}
}
