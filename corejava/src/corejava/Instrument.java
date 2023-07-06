package corejava;

abstract class Instrument {
	abstract void play();
}

class Piano extends Instrument{
	@Override
	void play() {
		System.out.println("Piano is playing tan tan tan tan ");
	}
}
class Guitar extends Instrument{
	@Override
	void play() {
		System.out.println("Guitar is playing tin tin tin tin ");
	}
}
class Flute extends Instrument{
	@Override
	void play() {
		System.out.println("Flute is playing toot toot toot toot ");
	}
}