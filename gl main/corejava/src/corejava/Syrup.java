package corejava;
class Syrup extends Medicine {
	@Override
	void displyLabel() {
		super.displyLabel();
		System.out.println("\tstore in a cool dry place");
	}

	public Syrup(String name, String address) {
		super(name, address);
	}
}