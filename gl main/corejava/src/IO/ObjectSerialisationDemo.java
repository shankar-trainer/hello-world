package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerialisationDemo {

	public static void main(String[] args) throws IOException {
		Person person1=new Person(1001,"mohan kumar","chennai");
		person1.country="Nepal";
	
		Person person2=new Person(1002,"rohan kumar","madurai");
		person2.country="Srilanka";
		ObjectOutputStream stream=null;
		try {
			stream=new ObjectOutputStream(new FileOutputStream("emp.ser"));
			stream.writeObject(person1);
			stream.writeObject(person2);
			System.out.println("Object written to the file");
		} catch (IOException e) {		 
			System.err.println(e);
		}
		finally {
			stream.close();
		}
		
		
		
		
		
	}
}
