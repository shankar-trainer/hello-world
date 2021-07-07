
public class College {

	private int collegeId;
	private String collegeName;
	private String collegeLocation;
	private float charges;
		
	public College(int collegeId, String collegeName, String collegeLocation, float charges) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegeLocation = collegeLocation;
		this.charges=charges;
	}
	
	public float getCharges() {
		return charges;
	}

	public void collegeFee() {
	  System.out.println("College Fee "+charges);	
	}
	
	public int getCollegeId() {
		return collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public String getCollegeLocation() {
		return collegeLocation;
	}	
}
