class Animal{
	
}
public class Dog  extends Animal{

	public static void main(String[] args) {
		Animal animal=new Animal();
		
		Dog dog=new Dog();
		
		//animal=dog;
		dog=(Dog) animal;
		//class Animal cannot be cast to class Dog 
	}
}
