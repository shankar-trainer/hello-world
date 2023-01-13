
public class MyCity extends City {

	private String state;
	private long population;

	public MyCity(int cityId, String cityName, String state, long population) {
		super(cityId, cityName);
		this.state = state;
		this.population = population;
	}

	@Override
	protected String cityInfo() {
		return super.cityInfo() +

				"\n\tstate is " + state + "\n\tpopulation  is " + population;
	}

	public static void main(String[] args) {
		MyCity city = new MyCity(877887, "nagpur", "maharastra", 6655675675656L);

		System.out.println(city.cityInfo());

	}

}
