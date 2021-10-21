package corejava;

public class AnimalMain {
	public static void main(String[] args) {

		Animal animal = new Dog();
		animal.sound();

		if (animal instanceof Animal) {
			System.out.println("animal is instance of Animal");
		}

		animal = new Cow();
		animal.sound();

		Dog dog = (Dog) new Animal();

	}
}
