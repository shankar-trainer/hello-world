package com.coforge.exception;

public class InstrumentMain {

	public static void main(String[] args) {
		
		Instrument instrument[]=new Instrument[10];
		
		instrument[0]=new Flute();
		instrument[1]=new Guitar();
		instrument[2]=new Piano();
		instrument[3]=new Flute();
		instrument[4]=new Piano();
		instrument[5]=new Guitar();
		instrument[6]=new Guitar();
		instrument[7]=new Flute();
		instrument[8]=new Piano();
		instrument[9]=new Flute();
		
		for (Instrument instrument2 : instrument) {
			instrument2.play();
		}
	}
}
