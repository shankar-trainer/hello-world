
public class Associate {

	private int associateId;
	private String associateName;
	private String workStatus;

	public Associate() {
		// TODO Auto-generated constructor stub
	}

	public int getAssociateId() {
		return associateId;
	}

	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}

	public String getAssociateName() {
		return associateName;
	}

	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}

	public String getWorkStatus() {
		return workStatus;
	}

	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}

	public void trackAssociateStatus
	(int days) {
		
		if(days>=1 && days<=20)
			setWorkStatus("Core skills");
		
		else if(days>=21 )
			setWorkStatus("Advanced modules");
		
		else if(days>=41 )
			setWorkStatus("Project phase");
		else
			setWorkStatus("Deployed in project");
			
		
	}
}
