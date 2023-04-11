class Animal{
	
}
public class Dog extends Animal {
     //Dog is a animal
	
	public static void main(String[] args) {
		 Animal a=new Animal();
		 Dog dog=new Dog();
		 //a=dog;
		 dog=(Dog) a;
	}
	
}
