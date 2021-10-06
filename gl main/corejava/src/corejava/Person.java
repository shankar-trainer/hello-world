package corejava;

public class Person {

	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id <= 0)
			System.out.println("wrong id");
		else
			this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() <= 10)
			System.out.println("invalid  name");
		else
			this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
