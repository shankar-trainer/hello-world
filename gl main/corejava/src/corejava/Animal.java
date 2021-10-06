package corejava;

public class Animal {

	void sound() {
		System.out.println("animal sound");
	}
}

class Dog extends Animal {

	void dogmethod() {

	}

	@Override
	void sound() {
		System.out.println("dog barks");
	}
}

class Cat extends Animal {
	void catmethod() {

	}

	@Override
	void sound() {
		System.out.println("cat  mews");
	}
}

class AnimalMain {

	public static void main(String[] args) {
		Animal animal;
		animal = new Dog();
		
		animal.sound();
		
		animal = new Cat();
		animal.sound();
	}
}