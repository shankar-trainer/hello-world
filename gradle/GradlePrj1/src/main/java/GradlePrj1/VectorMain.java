package GradlePrj1;

import java.util.Vector;

class Teacher {

	int id;
	String name;

	public Teacher(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}

}

class HOD {
}

class Student {
}

public class VectorMain {

	public static void main(String[] args) {
		Vector<Object> vector = new Vector<Object>();
		Teacher teacher = new Teacher(10001, "s kumar");
		HOD hod = new HOD();
		Student st = new Student();

		vector.add(teacher);
		vector.add(hod);
		vector.add(st);

		Teacher teacher1 = (Teacher) vector.get(0);
		System.out.println(teacher1);
	}

}
