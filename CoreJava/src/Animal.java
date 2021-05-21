
public class Animal {

	void sound() {
		System.out.println("animal sound");
	}
	
}

class Birds extends Animal{
	@Override
	void sound() {
	System.out.println("Birds sound");
	}
}

class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("Dog sound");
	}
	public static void main(String[] args) {
		Animal animal;
		animal=new Birds();
		animal.sound();

		animal=new Dog();
		animal.sound();
	}
}