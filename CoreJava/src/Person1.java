
public class Person1 {

	void info() {
		System.out.println("I am person");
	}
}

class Teacher extends Person1 {
	@Override
	void info() {
		System.out.println("I am a teacher");
	}
}

class Passenger1 extends Person1 {
	@Override
	void info() {
		System.out.println("I am a passenger");
	}
}

class Father extends Person1 {
	@Override
	void info() {
		System.out.println("I am a Father");
	}
}
