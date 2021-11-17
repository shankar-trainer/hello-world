
public class Lab {

	private int labId;
	private String  labName;
	//private final String labLocation="noida";
	private final String labLocation;
	
	public Lab() {
		labLocation="gurgaon";
	}

	public int getLabId() {
		return labId;
	}

	public void setLabId(int labId) {
		this.labId = labId;
	}

	public String getLabName() {
		return labName;
	}

	public void setLabName(String labName) {
		this.labName = labName;
	}

	public String getLabLocation() {
		return labLocation;
	}
	
	public static void main(String[] args) {
		 Lab lab=new Lab();
		 lab.setLabId(76567676);
		 lab.setLabName("java lab");
		 //lab.labLocation="";
		
		 System.out.println(lab.getLabId()+"  "+lab.getLabLocation()+"  "+lab.getLabName());
	}
}
