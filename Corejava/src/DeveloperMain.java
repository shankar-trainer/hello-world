import java.util.Scanner;

public class DeveloperMain {

	public static void main(String[] args) {
		int id;
		String name, company;
		int joinmonth;
		float salary;

		Developer developer[] = new Developer[3];

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < developer.length; i++) {
			System.out.println("Enter id, name, company name, join month,salary ");
			id = scanner.nextInt();
			scanner.nextLine();
			name = scanner.nextLine();
			company = scanner.next();
			joinmonth = scanner.nextInt();
			salary = scanner.nextFloat();
			developer[i] = new Developer(id, name, company, joinmonth, salary);
		}

		Developer.displayAllDeveoper(developer);

		scanner.close();
	}
}
