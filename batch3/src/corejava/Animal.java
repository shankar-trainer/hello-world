package corejava;

public class Animal {
}

class Dog extends Animal{
}

class AnimalMain{
	public static void main(String[] args) {
		Dog d1=new Dog();
		Animal animal=new Animal();
		//animal=d1;
		//d1=(Dog) animal;
		if(d1 instanceof Animal) 
		{
			animal=d1;
		}
		
	}
}
