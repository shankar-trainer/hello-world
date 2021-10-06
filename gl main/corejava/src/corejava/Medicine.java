package corejava;


public class Medicine {

	String name;
	String address;

	public Medicine() {
	}

	public Medicine(String name, String address) {

		this.name = name;
		this.address = address;
	}

	void displyLabel() {
		System.out.println("\nmedicine of company " + name);
		System.out.println("and address " + address);
	}
}






