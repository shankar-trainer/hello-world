package collection;

import java.util.Arrays;
import java.util.Comparator;

class SortByRoll implements Comparator<Student> {
	int x;

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getRoll() > o2.getRoll())
			x = 1;
		if (o1.getRoll() < o2.getRoll())
			x = -1;
		if (o1.getRoll() == o2.getRoll())
			x = 0;
		return x;
	}
}

class SortByMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		Float f1 = new Float(o1.getMarks());
		Float f2 = new Float(o2.getMarks());
		return f1.compareTo(f2);
		// return new Float(o1.getMarks()).compareTo(new Float(o2.getMarks()));
	}
}

class SortByName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

public class StudentMain {

	public static void main(String[] args) {

		Student student[] = new Student[3];

		student[0] = new Student(1007, "hari kumar", 78.56f);
		student[1] = new Student(1002, "sohan kumar", 58.56f);
		student[2] = new Student(1009, "aman kumar", 88.56f);

		Arrays.sort(student, new SortByRoll());

		System.out.println("\nStudent Information Sorted By Roll");
		System.out.println("\tRoll\tName\t\tMarks ");
		for (Student student2 : student) {
			System.out.println("\t" + student2.getRoll() + "\t" + student2.getName() + "\t\t" + student2.getMarks());
		}

		Arrays.sort(student, new SortByMarks());
		System.out.println("\nStudent Information Sorted By Marks");
		System.out.println("\tRoll\tName\t\tMarks ");
		for (Student student2 : student) {
			System.out.println("\t" + student2.getRoll() + "\t" + student2.getName() + "\t\t" + student2.getMarks());
		}	
		
		Arrays.sort(student, new SortByName());
		System.out.println("\nStudent Information Sorted By Name");
		System.out.println("\tRoll\tName\t\tMarks ");
		for (Student student2 : student) {
			System.out.println("\t" + student2.getRoll() + "\t" + student2.getName() + "\t\t" + student2.getMarks());
		}
	}
}
