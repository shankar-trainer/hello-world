package corejava;
class Ointment extends Medicine {
	@Override
	void displyLabel() {
		super.displyLabel();
		System.out.println("\tfor external Use Only");
	}

	public Ointment(String name, String address) {
		super(name, address);
	}
}