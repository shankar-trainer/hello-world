package edu.chitkara;

public class InstrumentMain {

	public static void main(String[] args) {
		Instrument instrument[]=new Instrument[10];
		
		instrument[0]=new Guitar();
		instrument[1]=new  Flute();
		instrument[2]=new Guitar();
		instrument[3]=new Piano();
		instrument[4]=new Guitar();
		instrument[5]=new Flute();
		instrument[6]=new Guitar();
		instrument[7]=new Piano();
		instrument[8]=new Flute();
		instrument[9]=new Guitar();
        for(Instrument  instrument1 :instrument)		
		     instrument1.play();
	}
}
