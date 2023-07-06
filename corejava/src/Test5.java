
public class Test5 {
	int id;
	String name;
//       final String country;// error 
//       final String country="india";// 1st way initialization
	final String country;// 1st way initialization
							// blank final

	public Test5() {
		this.country = "india";// 2nd way of initialization
		this.id = 9898;
		this.name = "pankaj kumar";
	}

	void info() {
		System.out.println("id is " + id);
		System.out.println("name is " + name);
		System.out.println("country  is " + country);
	}

	public static void main(String[] args) {
		Test5 test5 = new Test5();
		// test5.country="";// error
		test5.info();
		int x = 1000;
		final String name;

		System.out.println("no is " + x);
	}

}
