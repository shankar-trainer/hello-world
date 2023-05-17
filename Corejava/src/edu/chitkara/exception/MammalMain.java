package edu.chitkara.exception;

class Mammal {
}

class Cat extends Mammal {
}

class Rabbit extends Mammal {
}

public class MammalMain {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Rabbit rabbit = new Rabbit();
		Mammal mammal = new Mammal();
		mammal = cat;// cat is a mammal
		mammal = rabbit; // rat is a mammal
		// cat=(Cat) mammal; // mammal is a cat // runtime error classcast exception

		// cat=rabbit; //error compilation
		// rabbit=cat; //error compilation

		Number n = 99;

		Float f = 8787.8778f;
		Integer i = 78788;

		n = f;
		n = i;
		i = (Integer) n;

		//f = i;
		//i = f;

	}
}
