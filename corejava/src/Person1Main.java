
public class Person1Main {

	public static void main(String[] args) {
				
		Person1 person1;
		
		person1=new Father();
		person1.info();
		System.out.println("------");
		person1.display(); // call super class static method
		Father.display(); // current class call re written static method
		
		
		person1=new Patient();
		person1.info();
		
		person1=new Manager();
		person1.info();
		
		Person1.display();
		Patient.display();
		Manager.display();
		
		Father.display();
	}
}
