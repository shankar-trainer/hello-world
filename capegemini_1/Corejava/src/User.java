public class User {

	private int id;
	private String name;
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id < 0)
			System.out.println("id is -ve");
		else
			this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.isEmpty())
			System.out.println("name is empty");
		else if (name.length() <= 3)
			System.out.println("name length <=3 not allowed");
		else
			this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		if (city.isEmpty())
			System.out.println("city is blank");
		else
			this.city = city;
	}

}
