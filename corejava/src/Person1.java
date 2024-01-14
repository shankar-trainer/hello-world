//public abstract class Person1 {
public abstract class Person1 {
	void info() {
		System.out.println("person info");
	}
	// final method cannot be overridden
	final void show() {
		System.out.println("show method");
	}
	// static methods are inherited, but it cannot be overridden, can be re written
	static void display() {
		System.out.println("person1 display method");
	}
}

class Father extends Person1 {
	@Override
	void info() {
		System.out.println("person is father");
	}
	
//	@Override
//	void show() {
//	System.out.println("this is show1");
//	}
	
	//@Override 
	 // re writing 
	static void display() {
		System.out.println("father display method");
	}
}

class Patient extends Person1 {
	@Override
	void info() {
		System.out.println("person is patient");
	}
}

class Manager extends Person1 {
	@Override
	void info() {
		System.out.println("person is manager");
	}
}
