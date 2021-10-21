public class Distance {
	float km;
	float meter;
	float centimeter;
	float feet;
	float inch;

	void convertToMeterCentimeter() {
     meter=km/1000;
     centimeter=meter/1000; 
	}

	void convertToFeetInches() {

	}

	public Distance(float km) {
		this.km = km;
	}

	public float getKm() {
		return km;
	}

	public float getMeter() {
		return meter;
	}

	public float getCentimeter() {
		return centimeter;
	}

	public float getFeet() {
		return feet;
	}

	public float getInch() {
		return inch;
	}

}
