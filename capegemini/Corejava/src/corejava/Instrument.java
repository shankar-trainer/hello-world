package corejava;
public abstract class Instrument {
	int id;
	String name;
	float cost;
	public Instrument(int id, String name, float cost) {
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	abstract void play();
	void instrumentInfo(){
		System.out.println("Instrument Info");
		System.out.println("\tId is "+id);
		System.out.println("\tName is "+name);
		System.out.println("\tCost is "+cost);
	}
}

class Piano extends Instrument {
	public Piano(int id, String name, float cost) {
		super(id, name, cost);
	}

	@Override
	void play() {
		System.out.println("play piano ");
	}
}
class Flute extends Instrument {
	public Flute(int id, String name, float cost) {
		super(id, name, cost);
	}

	@Override
	void play() {
		System.out.println("play flute ");
	}
}