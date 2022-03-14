class Animal1{
	
}

public class Dog2  extends Animal1{

	public static void main(String[] args) {
     Dog2 d=new Dog2();
     Animal1 animal=new Animal1();
     
     System.out.println(d instanceof Animal1);
     System.out.println(d instanceof Dog2);
     System.out.println(d instanceof Object);
     
     //d=(Dog2) animal;
     //java.lang.ClassCastException: Animal1 cannot be cast to Dog2
     if(animal instanceof Dog2)
    	 d=(Dog2) animal;
	}
}
