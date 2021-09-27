package pack2;

//dog is a animal 
//animal is a dog // error 

public class Animal {

}

class Dog  extends Animal {

	public static void main(String[] args) {
		Dog dog=new Dog();
		Animal animal=new Animal();
		//animal=dog;//dog is a animal 

		//dog=(Dog) animal;//animal is a dog // error 
		  // run time error class cast exception 
		
		if(animal instanceof Dog) {
			dog=(Dog) animal;	
			System.out.println("animal instance of Dog");
		}
		
		System.out.println(animal instanceof Dog);
		System.out.println(animal instanceof Animal);
		System.out.println(animal instanceof Object);
		System.out.println(dog instanceof Object);
		System.out.println(dog instanceof Animal);
	}
}
