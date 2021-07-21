import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {

		Person person[] = new Person[3];
		 person[0]=new Person(10001, "surendra kumar",34, "hyderabad", 24000);
		 person[1]=new Person(10002, "amrendra kumar",37, "noida", 54000);
		 person[2]=new Person(10003, "virendra kumar",24);

	/*	Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < person.length; i++) {
			System.out.println("Enter id name age location and salary");

			person[i] = new Person(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.next(),
					scanner.nextFloat());
		}
*/
		for (Person person2 : person) {
			System.out.println(person2.getPersonId() + "  " + person2.getPersonName() + "  " + person2.getPersonAge()
					+ "  " + person2.getPersonLocation() + "  " + person2.getPersonsalary());
		}
	}
}
