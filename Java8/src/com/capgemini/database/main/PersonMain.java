package com.capgemini.database.main;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.capgemini.database.dao.PersonDao;
import com.capgemini.database.model.Person;

public class PersonMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Integer, Person> allPerson;
		try {
			PersonDao dao = new PersonDao();
			String s = "y";
			Person person = null;
			while (s.equalsIgnoreCase("y")) {
				System.out.println("\n1.Show All Person");
				System.out.println("2.Add Person");
				System.out.println("3.Search Person");
				System.out.println("4.Update Person");
				System.out.println("5.Remove Person");

				int op = scanner.nextInt();
				switch (op) {
				case 1:
					allPerson = dao.getAllPerson();
					if (allPerson.isEmpty())
						System.out.println("No Record Found");
					else {
						Set<Integer> keySet = allPerson.keySet();
						for (Integer integer : keySet) {
							Person p = allPerson.get(integer);
							System.out
									.println(p.getId() + "  " + p.getName() + "  " + p.getSalary() + "  " + p.getDob());
						}
					}
					break;

				case 2:
					person = null;
					person = new Person();

					System.out.println("Enter id");
					person.setId(scanner.nextInt());

					System.out.println("Enter Name");
					scanner.nextLine();
					person.setName(scanner.nextLine());

					System.out.println("Enter Salary");
					person.setSalary(scanner.nextFloat());

					System.out.println("Enter DOB in dd\\MM\\yyyy format ");
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd\\MM\\yyyy");
					String s1 = scanner.next();

					Date parse = null;
					try {
						parse = dateFormat.parse(s1);
						person.setDob(parse);
						if (dao.addPerson(person))
							System.out.println("Person added");
						else
							System.out.println("Person with id already present");

					} catch (ParseException e) {
						System.err.println("DOB not  in dd\\MM\\yyyy format");
					}

					break;

				case 3:
					System.out.println("Enter id ");
					person = null;
					person = dao.searchPerson(scanner.nextInt());
					if (person == null)
						System.out.println("Person id not found");
					else {
						System.out.println("Person  found");
						System.out.println(person.getId() + "\t" + person.getName() + "\t" + person.getSalary() + "\t"
								+ person.getDob());
					}

					break;

				case 4:
					person = null;
					person = new Person();

					System.out.println("Enter id");
					person.setId(scanner.nextInt());

					System.out.println("Enter Name");
					scanner.nextLine();
					person.setName(scanner.nextLine());

					System.out.println("Enter Salary");
					person.setSalary(scanner.nextFloat());

					System.out.println("Enter DOB in dd\\MM\\yyyy format ");
					dateFormat = new SimpleDateFormat("dd\\MM\\yyyy");
					s1 = scanner.next();

					parse = null;
					try {
						parse = dateFormat.parse(s1);
						person.setDob(parse);
						if (dao.updatePerson(person))
							System.out.println("Person updated");
						else
							System.out.println("Person not present");

					} catch (ParseException e) {
						System.err.println("DOB not  in dd\\MM\\yyyy format");
					}

					break;
				case 5:
					System.out.println("Enter id ");

					if (dao.removePerson(scanner.nextInt()))
						System.out.println("Record deleted");
					else
						System.out.println("Record not present");
					break;

				default:
					System.out.println("invalid operation try again");
					break;
				}
				System.out.println("Continue y\\n");
				s = scanner.next();
			}
		} catch (SQLException e) {
			System.err.println(e);
		}
		scanner.close();
	}
}
