  //constructors are not inherited
  //is  calling   super class constructors using super keyword

class A{
	A(){
		System.out.println("constructor A called ");
	}
}

class B extends A{
	B(){
		System.out.println("constructor B called ");
	}
}

public class C  extends B{
	C(){
		System.out.println("constructor C called ");
	}

	public static void main(String[] args) {
		new C();
	}
}
