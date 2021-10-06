package corejava;
class Tablet extends Medicine {
	@Override
	void displyLabel() {
		super.displyLabel();
		System.out.println("\toral use ");
	}

	public Tablet(String name, String address) {
		super(name, address);
	}
}