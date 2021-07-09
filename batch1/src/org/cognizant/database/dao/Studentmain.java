package org.cognizant.database.dao;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Studentmain {

	public static void main(String[] args) {
		StudentDao dao = null;
		try {
			dao = new StudentDao();
		} catch (SQLException e1) {
			System.err.println(e1);
		}
		int roll;
		String name, subject, s;
		float marks;
		Date dob;

		Scanner scanner = new Scanner(System.in);
		String ch = "y";
		Student student;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		while (ch.equals("y")) {
			System.out.println("1.Add Record");
			System.out.println("2.Search Record");
			System.out.println("3.Show All Record");
			int op = scanner.nextInt();
			switch (op) {
			case 1:
				System.out.println("Enter roll name subject marks dob(dd-MM-yyyy)");
				student = null;
				roll = scanner.nextInt();
				scanner.nextLine();
				name = scanner.nextLine();
				subject = scanner.next();
				marks = scanner.nextFloat();
				s = scanner.next();
				try {
					dob = dateFormat.parse(s);
					student = new Student(roll, name, subject, marks, dob);
					dao.addStudent(student);
				} catch (ParseException e) {
					System.out.println("dob not in dd-MM-yyyy format ");
				} catch (SQLException e) {
					e.printStackTrace();
				}

				break;
			case 2:
				System.out.println("Enter roll");
				roll = scanner.nextInt();
				try {
					student = null;
					student = dao.searchStudent(roll);
					if (student == null)
						System.out.println("student not found");
					else {
						System.out.println("student found with details ");
						System.out.println(student.getRoll() + " " + student.getName() + " " + student.getSubject()
								+ " " + student.getMarks() + " " + student.getDob());
					}
				} catch (SQLException e) {
					System.err.println(e);
				}

				break;
			case 3:
				try {
					String colname[]=dao.getColNames();
					for (String string : colname) {
						System.out.print(string+" ");
					}
					System.out.println("\n");
					for (Student s1 : dao.getAllStudent())
						System.out.println(s1.getRoll() + " " + s1.getName() + " " + s1.getSubject() + " "
								+ s1.getMarks() + " " + s1.getDob());
				} catch (SQLException e) {
					System.err.println(e);
				}

				break;

			default:
				break;
			}
			System.out.println("continue y\\n");
			ch = scanner.next();
		}

	}
}
