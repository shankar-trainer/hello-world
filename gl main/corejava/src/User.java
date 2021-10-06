
public class User {

	int id;
	String name;

	public  User() {
		System.out.println("constructor called");
		id = 1001;
		name = "suresh kumar";
	}

	public static void main(String[] args) {
		User user = new User();
		System.out.println(user.id + "  " + user.name);
	}

}
