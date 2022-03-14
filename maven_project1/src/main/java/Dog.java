class Animal{
	
	
}

public class Dog  extends Animal{

	public static void main(String[] args) {
     Dog d=new Dog();
     Animal animal=new Animal();
     
     //animal=d;  // dog is a animal
    
     d=(Dog) animal;// animal is a dog -- wrong
     //java.lang.ClassCastException: Animal cannot be cast to Dog
    
     
	}
}
