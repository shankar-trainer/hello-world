package corejava;

public class InstrumentMain {

	public static void main(String[] args) {
		//Instrument instrument=new Instrument();
		Instrument instrument1=new Piano(1001,"piano",6789);
		Instrument instrument2=new Flute(1008,"Flute",785);

		instrument1.play();
		instrument2.play();
		
		instrument1.instrumentInfo();
		instrument2.instrumentInfo();
	}
}
