
public class City {

	private int cityId;
	private String cityName;
	
	public City(int cityId, String cityName) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
	}
	
	
	protected String cityInfo() {
		return "City Info  \n"+
	               "\n\tid is "+cityId+
	               "\n\tname is "+cityName;
	} 
	
}
