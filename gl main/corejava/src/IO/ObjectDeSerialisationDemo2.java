package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectDeSerialisationDemo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ObjectInputStream stream = new ObjectInputStream(new FileInputStream("emp.ser"));

		/*Person person = (Person) stream.readObject();

		System.out.println("Person Information");
		System.out.println("Id is " + person.getPid());
		System.out.println("Name is " + person.getPname());
		System.out.println("Address is " + person.getAddress());
		System.out.println("Country  is " + person.country);

		person = (Person) stream.readObject();

		System.out.println("\nPerson Information");
		System.out.println("Id is " + person.getPid());
		System.out.println("Name is " + person.getPname());
		System.out.println("Address is " + person.getAddress());
		System.out.println("Country  is " + person.country);*/
		
		
		Person person[] =new Person[2];

		for (int i = 0; i < person.length; i++) {
			person[i]= (Person) stream.readObject();
		}
		for (Person person2 : person) {
			System.out.println("\nPerson Information");
			System.out.println("Id is " + person2.getPid());
			System.out.println("Name is " + person2.getPname());
			System.out.println("Address is " + person2.getAddress());
			System.out.println("Country  is " + person2.country);
		}
		
	}
}
