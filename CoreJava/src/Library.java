
public class Library {

	private int id;
	private String  name;
	private String location;
	private static String state;
	private static String country;
	
	static {
		state="delhi";
		country="india";
	}
	
	public Library(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}


	public void libraryInfo() {
		  System.out.println("library information\n");
		  System.out.println("\tid "+id);
		  System.out.println("\tname  "+name);
		  System.out.println("\tlocation "+location);
		  System.out.println("\tstate "+state);
		  System.out.println("\tstate "+country);
	}
	
	public static void libraryInfo1(Library library) {
		System.out.println("library information\n");
		System.out.println("\tid "+library.id);
		System.out.println("\tname  "+library.name);
		System.out.println("\tlocation "+library.location);
		System.out.println("\tstate "+state);
		System.out.println("\tstate "+country);
	}
}
