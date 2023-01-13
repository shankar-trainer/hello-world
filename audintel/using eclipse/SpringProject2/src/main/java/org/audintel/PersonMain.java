package org.audintel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.audintel.config.PersonDaoConfig;
import org.audintel.dao.PersonDao;
import org.audintel.dao.PersonDaoImpl;
import org.audintel.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "org.audintel.dao" })
public class PersonMain {

	public static void main(String[] args) {

		// 1st way
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(PersonDaoImpl.class);
//		PersonDao dao = ctx.getBean(PersonDaoImpl.class);

		// 2nd way
		ApplicationContext ctx = new AnnotationConfigApplicationContext(PersonDaoConfig.class);
		// personDaoImpl,getPersonDao
		PersonDao dao = ctx.getBean("getPersonDao", PersonDaoImpl.class);

		Scanner sc = new Scanner(System.in);
		Person p1;

		String ch = "y";
		while (ch.equalsIgnoreCase("y")) {
			System.out.println("1.Add Person");
			System.out.println("2.Show All Person");
			System.out.println("3.Search Person");
			System.out.println("4.Remove Person");
			System.out.println("5.Update Person");
			int op = sc.nextInt();

			switch (op) {
			case 1: {
				p1 = null;
				p1 = new Person();
				System.out.println("Enter id name salary and date in dd-mm-yyyy format ");
				p1.setPersonId(sc.nextInt());
				sc.nextLine();

				p1.setPersonName(sc.nextLine());
				p1.setPersonSlaray(sc.nextFloat());
				String s = sc.next();

				DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

				LocalDate parse = LocalDate.parse(s, dateTimeFormatter);

				p1.setPersonDob(parse);

				Person p2 = dao.addPerson(p1);

				if (p2 == null)
					System.out.println("not added id already present ");
				else
					System.out.println("person added " + p2);
				break;
			}
			case 2: {
				System.out.println("all person details");
				for (Person p : dao.getAllPerson())
					System.out.println(p);
				break;
			}
			case 3: {
				System.out.println("Enter id to search ");
				p1 = null;
				p1 = dao.searchPerson(sc.nextLong());
				if (p1 == null)
					System.out.println("not found ");
				else
					System.out.println("found " + p1);
				break;
			}
			case 4: {
				System.out.println("Enter id to remove ");
				p1 = null;
				p1 = dao.deletePerson(sc.nextLong());
				if (p1 == null)
					System.out.println("not found ");
				else
					System.out.println("removed " + p1);

				break;
			}
			case 5: {
				p1 = null;
				p1 = new Person();
				System.out.println("UUpdate Operation");
				System.out.println("Enter id name salary and date in dd-mm-yyyy format ");
				p1.setPersonId(sc.nextInt());
				sc.nextLine();

				p1.setPersonName(sc.nextLine());
				p1.setPersonSlaray(sc.nextFloat());
				String s = sc.next();

				DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

				LocalDate parse = LocalDate.parse(s, dateTimeFormatter);

				p1.setPersonDob(parse);

				Person p2 = dao.updatePerson(p1);

				if (p2 == null)
					System.out.println("not updated  id not present ");
				else
					System.out.println("person updated " + p2);

				break;
			}

			default:
				System.out.println("invalid operation  try again");
			}
			System.out.println("continue y\\n");
			ch = sc.next();
		}
	}
}
