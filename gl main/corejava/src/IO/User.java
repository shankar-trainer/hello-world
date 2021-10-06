package IO;

import java.io.Serializable;

public class User implements Serializable {

	private int roll;
	private int age;
	private String name;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) throws Exception {
		if (roll <= 0)
			throw new Exception("roll is 0 or -ve");
		else
			this.roll = roll;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if (age <= 0)
			throw new Exception("age is 0 or -ve");
		else
			this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		if (name.isEmpty())
			throw new Exception("name is empty");
		else
			this.name = name;
	}
}
