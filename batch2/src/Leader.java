
public class Leader {
	
	private int  leaderRgNo;
	private  String  leadername;
	private int  leaderAge;
	
	
	public Leader(int leaderRgNo, String leadername, int leaderAge) {
		super();
		this.leaderRgNo = leaderRgNo;
		this.leadername = leadername;
		this.leaderAge = leaderAge;
	}

	public void leaderInfo() {
		System.out.println("\nLeader Infroamtion"); 
		System.out.println("Id  "+leaderRgNo);
		System.out.println("name  "+leadername);
		System.out.println("age  "+leaderAge);
	}

	public static void main(String[] args) {
		Leader leader1=new Leader(77667767, "suresh menon", 45);
		Leader leader2=new Leader(77667768, "mukesh menon", 60);
		
		leader1.leaderInfo();
		leader2.leaderInfo();
				
		Leader leader3=leader1;
		leader3.leaderInfo();
		
		leader1.leadername="s kumar";
		
		
		leader3.leaderInfo();
		leader2.leaderInfo();
		
	}
 }
