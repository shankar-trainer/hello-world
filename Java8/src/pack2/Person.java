package pack2;

public class Person {

	@Override
	public String toString() {
		return "I am a person";
	}
    
}
class Employee1 extends Person{

	@Override
	public String toString() {
		return "I am a employee";
	}
	
}
class Father extends Person{

	@Override
	public String toString() {
		return "I am a father";
	}

}
class Patient extends Person{

	@Override
	public String toString() {
		return "I am a patient";
	}

}
class Passenger extends Person{

	@Override
	public String toString() {
		return "I am a passenger";
	}

}
class PersonMain{
	public static void main(String[] args) {
		Person p1;
		
		p1=new Employee1();
		System.out.println(p1);
		p1=new Father();
		System.out.println(p1);
		p1=new Patient();
		System.out.println(p1);
		p1=new Passenger();
		System.out.println(p1);
		
	}
}
