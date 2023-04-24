public class Person1 {
	void info() {
		System.out.println("I am a person");
	}
}
class TrainPassenger extends Person1 {
	@Override
	void info() {
		System.out.println("I am a train passenger");
	}
}
class Programmer extends Person1 {
	@Override
	void info() {
		System.out.println("I am a programmer");
	}
}
class Father extends Person1 {
	@Override
	void info() {
		System.out.println("I am a father");
	}
}

