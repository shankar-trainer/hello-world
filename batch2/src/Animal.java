public class Animal {
	
}
class Dog extends Animal{
	
	public static void main(String[] args) {
		Animal animal=new Animal();
		Dog d=new Dog();
		//animal=d;
		d=(Dog) animal;
	}
}
