
public class School {

	private int regNo;
	private String name;
	private String location;
	/*
	@Override
	public String toString() {
		return "School Information"+
	            "\nReg no is "+regNo+
	            "\nName is "+name+
	            "\nLocation is "+location;
	}
	*/
	
	
	public School(int regNo, String name, String location) {
		this.regNo = regNo;
		this.name = name;
		this.location = location;
	}

	@Override
	public String toString() {
		return "School [regNo=" + regNo + ", name=" + name + ", location=" + location + "]";
	}

	public static void main(String[] args) {
		School school=new School(100016556, "kids zone", "patna");
		
		System.out.println(school);
		
	}
}
