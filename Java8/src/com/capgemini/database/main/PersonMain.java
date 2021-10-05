package com.capgemini.database.main;

import java.sql.SQLException;
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

				default:
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
