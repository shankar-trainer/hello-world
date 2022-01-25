
public class Person2 {
  public Person2() {
   System.out.println("i am person ");
  }
}

class Professor extends Person2{
	public Professor() {
		   System.out.println("i am propfessor ");
	
	}
} 
class TrainPassenger extends Person2{
	public TrainPassenger() {
		System.out.println("i am passenger ");
	}
} 

class Parents  extends Person2{
	public Parents() {
		System.out.println("i am parents ");
		
	}
} 

class PersonMain{
	public static void main(String[] args) {
	 Person2 person;
	 person=new Professor();
	 person=new Parents();
	 person=new TrainPassenger();
   	}
}

