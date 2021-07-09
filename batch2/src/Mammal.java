
public class Mammal {
	void sound() {
		System.out.println("mammal sound");
	}
}

class Cat extends Mammal {
	@Override
	void sound() {
		System.out.println("cat sound");
	}
}

class Cow extends Mammal {
	void sound() {
		System.out.println("cow sound");
	}
	public static void main(String[] args) {
		Mammal mammal;
		
		mammal=new Cat();
		mammal.sound();
		
		mammal=new Cow();
		mammal.sound();
		
	}
}
