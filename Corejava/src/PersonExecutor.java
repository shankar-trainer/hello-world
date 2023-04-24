
public class PersonExecutor {

	public static void main(String[] args) {

		Person1 person1;   // dynamic binding 

		person1 = new TrainPassenger();// jvm determines the object type
		person1.info();

		person1 = new Father();
		person1.info();

		person1 = new Programmer();
		person1.info();
	}
}
