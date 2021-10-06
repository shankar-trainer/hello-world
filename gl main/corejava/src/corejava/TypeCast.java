package corejava;

class Animal1 {
}

class Dog1 extends Animal1 {

}


public class TypeCast {

	public static void main(String[] args) {
		Animal1 animal1=new Animal1();
		Dog1 dog1=new Dog1();
		
		//animal1=dog1;
		
		dog1=(Dog1) animal1;
		
		Integer x=100;
		Float y=200.0f;
		
		Number n=x;
	
		//x=y;
		//y=x;
		
	}

}
