package corejava;

public class InstrumentMain {

	public static void main(String[] args) {
		Instrument instrument[]=new Instrument[10];
		
		instrument[0]=new Piano();
		instrument[1]=new Flute();
		instrument[2]=new Piano();
		instrument[3]=new Flute();
		instrument[4]=new Guitar();
		instrument[5]=new Piano();
		instrument[6]=new Guitar();
		instrument[7]=new Flute();
		instrument[8]=new Guitar();
		instrument[9]=new Piano();
		
		for(Instrument instrument2:instrument)
			instrument2.play();
		
	}
}
