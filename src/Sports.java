public class Sports {

	private int id;
	private String name;

	void welcome() {
		System.out.println("welcome method ");
	}
	
	final void sportsInfo() {
		System.out.println("soprts information ");
		System.out.println("\tid is " + id);
		System.out.println("\tname is " + name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
