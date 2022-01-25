
public class Person1 {
	void info() {
		System.out.println("I am Person");
	}
}

class Manager1 extends Person1 {
	@Override
	void info() {
		System.out.println("I am Manger ");
	}
}
class Passenger extends Person1 {
	@Override
	void info() {
		System.out.println("I am Passenger ");
	}
}
class Father extends Person1 {
	@Override
	void info() {
		System.out.println("I am Father ");
	}
}