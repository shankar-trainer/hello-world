package corejava;

abstract class Instrument {
	abstract void play();
}

class Piano extends Instrument {
	@Override
	void play() {
		System.out.println("Piano is playing  tan tan tan tan");
	}
}

class Flute extends Instrument {
	@Override
	void play() {
		System.out.println("Flute is playing  toot toot toot toot");
	}
}

class Guitar extends Instrument {
	@Override
	void play() {
		System.out.println("Guitar is playing  tin tin tin");
	}
}

class Main {

	public static void main(String[] args) {

		Instrument instrument[] = new Instrument[10];
		instrument[0] = new Guitar();
		instrument[1] = new Flute();
		instrument[2] = new Guitar();
		instrument[3] = new Piano();
		instrument[4] = new Flute();
		instrument[5] = new Flute();
		instrument[6] = new Guitar();
		instrument[7] = new Piano();
		instrument[8] = new Flute();
		instrument[9] = new Flute();
		
		for (Instrument instrument2 : instrument) {
			instrument2.play();
		}
		
		for (int i = 0; i < instrument.length; i++) {
			if(instrument[i] instanceof Guitar)
				System.out.println(i+" position Guitar is present");
			if(instrument[i] instanceof Piano)
				System.out.println(i+" position Piano is present");
			if(instrument[i] instanceof Flute)
				System.out.println(i+" position Flute is present");
		}
	}

}