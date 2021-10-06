package corejava;

public class Person {

	private int id;
	private String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person person = (Person) obj;
			if ((person.id == this.id) && 
					(person.name.equals(this.name)))

				return true;
		}
		return false;

	}

}
