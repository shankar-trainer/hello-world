import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		Person person=new Person();
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter id name and salary ");
		person.setId(scanner.nextInt());
		scanner.nextLine();
		person.setName(scanner.nextLine());
		person.setSalary(scanner.nextFloat());
		
		System.out.println("person data");
		System.out.println("id :"+person.getId());
		System.out.println("name :"+person.getName());
		System.out.println("salary :"+person.getSalary());
		scanner.close();
		
		
	}
}
