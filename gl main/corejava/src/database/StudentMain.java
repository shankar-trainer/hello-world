package database;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import database.model.Student;

public class StudentMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String ch = "y";
		StudentOperation operation = new StudentOperation();

		while (ch.equalsIgnoreCase("y")) {
			System.out.println("1. Add Student");
			System.out.println("2. Remove Student");
			System.out.println("3. Show All Student");
			System.out.println("4. Search Student");
			System.out.println("5. Update Student");
			int key = scanner.nextInt();

			List<Student> list_student;
			Student student;
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			switch (key) {
			case 1:
				try {
					student = null;
					student = new Student();
					System.out.println("Enter roll");
					student.setRoll(scanner.nextInt());

					System.out.println("Enter name");
					scanner.nextLine();
					student.setName(scanner.nextLine());

					System.out.println("Enter Marks");
					student.setMarks(scanner.nextFloat());

					System.out.println("Enter DOb in dd-MM-yyyy format");
					Date d1 = dateFormat.parse(scanner.next());
					student.setDob(new java.sql.Date(d1.getTime()));

					if(operation.addStudent(student))
						System.out.println("Record added");
					else
						System.out.println("Record already present for this roll");
					
				} catch (SQLException | ParseException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 5:
			 
				try {
					student = null;
					student = new Student();
					System.out.println("Enter roll");
					student.setRoll(scanner.nextInt());

					System.out.println("Enter name");
					scanner.nextLine();
					student.setName(scanner.nextLine());

					System.out.println("Enter Marks");
					student.setMarks(scanner.nextFloat());

					System.out.println("Enter DOb in dd-MM-yyyy format");
					Date d1 = dateFormat.parse(scanner.next());
					student.setDob(new java.sql.Date(d1.getTime()));

					if(operation.updateStudent(student))
						System.out.println("Record updated");
					else
						System.out.println("Record not  present for this roll");
					
				} catch (SQLException | ParseException e) {
					System.err.println(e.getMessage());
				}
				
				break;
				

			case 3:
				try {
					list_student = operation.showAllStudent();
					for (Student student1 : list_student) {
						System.out.println(student1.getRoll() + "  " + student1.getName() + " " + student1.getMarks() + " "
								+ student1.getDob());
					}
				} catch (SQLException e) {
					//System.err.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					student = null;
					student = new Student();
					System.out.println("Enter roll");
					student.setRoll(scanner.nextInt());
					if(operation.removeStudent(student))
						System.out.println("student record removed ");
					else
						System.out.println("student record not present");
					
					 
				} catch (SQLException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 4:
				try {
					student = null;
					student = new Student();
					System.out.println("Enter roll");
					student.setRoll(scanner.nextInt());
					if(operation.searchStudent((student)))
						System.out.println("student record found ");
					else
						System.out.println("student record not present");
				} catch (SQLException e) {
					System.err.println(e.getMessage());
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
