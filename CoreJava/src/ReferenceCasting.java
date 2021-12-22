class Animal {
}

class Cat{}
class Dog extends Animal {
	// Dog is a animal
}

public class ReferenceCasting {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		// animal=dog;  // ok 

		//dog = (Dog) animal; // error 
//class Animal cannot be cast to class Dog

		if(animal instanceof Dog)
		  dog = (Dog) animal; 			

		Cat cat=new Cat();
		//error   
		//cat=dog;
		//dog=cat;
	}

}
