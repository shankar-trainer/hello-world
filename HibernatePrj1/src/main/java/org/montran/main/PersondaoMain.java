package org.montran.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.montran.dao.PersonDao;
import org.montran.model.Person;

public class PersondaoMain {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		PersonDao dao = new PersonDao();
		Person person;
		String ch = "y";
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		while (ch.equals("y")) {
			System.out.println("1.Add Employee");
			System.out.println("2.Search Employee");
			System.out.println("3.Show All Employee");
			System.out.println("4.Update Employee");
			System.out.println("5.Delete Employee");
			int op = scanner.nextInt();
			switch (op) {
			case 1:
				System.out.println("Enter name");
				person = new Person();
				scanner.nextLine();
				person.setName(scanner.nextLine());
				System.out.println("Enter DOB dd-MM-yyyy format");
				String s = scanner.next();
				Date parse = dateFormat.parse(s);
				person.setDob(parse);
				if (dao.addPerson(person))
					System.out.println("person added");
				else
					System.out.println("person id already present");
				break;
			case 2:
				person = null;
				System.out.println("Enter id ");
				person = new Person();
				person.setId(scanner.nextInt());

				if (dao.searchPerson(person) != null) {
					System.out.println("found");
					Person searchPerson = dao.searchPerson(person);
					System.out.println(
							searchPerson.getId() + "  " + searchPerson.getName() + "  " + searchPerson.getDob());
				}
				else 
					System.out.println("person id not present");

				break;
			case 3:
				if(dao.getAllPerson().size()>=1) {
				dao.getAllPerson().forEach(a -> System.out.println(a.getId() + "  " + a.getName() + "  " + a.getDob()));
				}
				else
					System.out.println("no record is present");
				break;
			case 4:
				System.out.println("Enter id ");
				person = null;
				person = new Person();
				person.setId(scanner.nextInt());

				System.out.println("Enter name");
				scanner.nextLine();
				person.setName(scanner.nextLine());
				System.out.println("Enter DOB dd-MM-yyyy format");
				s = scanner.next();
				parse = dateFormat.parse(s);
				person.setDob(parse);
				if (dao.updatePerson(person))
					System.out.println("person updated");
				else
					System.out.println("person id not present");
				break;

			case 5:
				person = null;
				System.out.println("Enter id ");
				person = new Person();
				person.setId(scanner.nextInt());

				if (dao.removePerson(person)) {
					System.out.println("person removed");
				} else
					System.out.println("person id not found");
				break;

			default:
				break;
			}
			System.out.println("continue y\\n");
			ch = scanner.next();
		}
	}
}
