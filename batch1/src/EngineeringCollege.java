
public class EngineeringCollege  extends College{
	private String[] courses;
	private String country;
	
	public EngineeringCollege(int collegeId, String collegeName, String collegeLocation, float charges,
			String[] courses, String country) {
		super(collegeId, collegeName, collegeLocation,charges);
		this.courses = courses;
		this.country = country;
	}

	public String[] getCourses() {
		return courses;
	}

	public String getCountry() {
		return country;
	}
	
	@Override
	public void collegeFee() {
		super.collegeFee();
		System.out.println("Hostel Fee "+super.getCharges()*50/100);
		System.out.println("Sports  Fee "+super.getCharges()*10/100);
	}

	public static void main(String[] args) {
		EngineeringCollege college=new EngineeringCollege(545454, "bhabha engineering college",
				"gwalior", 100000, new String[] {"BCA","MCA","B.Tech","M.Tech"}, "india");
	
		System.out.println("College Information");
		System.out.println("College Reg no "+college.getCollegeId());
		System.out.println("College Name "+college.getCollegeName());
		System.out.println("College Location "+college.getCollegeLocation());
		college.collegeFee();
		
		System.out.println("College Courses ");
		for(String s:college.getCourses())
			System.out.print("\t"+s);
		System.out.println();
		System.out.println("College Country "+college.getCountry());
	
		
		
		
	}
	
}
