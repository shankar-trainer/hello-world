
public class Animal {
	void sound() {
		System.out.println("animal sound");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("dog barks");
	}
}

class Birds extends Animal {
	@Override
	void sound() {
		System.out.println("birds twitter");
	}
	public static void main(String[] args) {
		Animal animal1=new Dog();
		animal1.sound();
		
		animal1=new Birds();
		animal1.sound();
		
	}
}
