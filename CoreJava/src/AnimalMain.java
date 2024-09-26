class Animal {
	void sound() {
		System.out.println("animal sound");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("dog barks ");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("cat  mews ");
	}
}

public class AnimalMain {
	public static void main(String[] args) {
		Animal animal = new Cat();  // dynamic binding 
		animal.sound();

		animal = new Dog();
		animal.sound();
	}
}
