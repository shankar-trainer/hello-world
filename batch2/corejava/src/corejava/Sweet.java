package corejava;

public class Sweet {

	private int sweetId;
	private String sweetName;
	private float sweetCost;

	@Override
	public boolean equals(Object obj) {
		boolean status=false;
		if(obj instanceof Sweet ) {
		           Sweet swt=(Sweet) obj;
		           if(this.sweetId==swt.sweetId && this.sweetName==swt.sweetName  && 
		        		   this.sweetCost==swt.sweetCost) {
		        	   status= true;
		           }
		}
		return status;
	}
	
	@Override
	public String toString() {
		return "Sweet Record " + "\n\tsweet id " + sweetId + "\n\tsweet name " + sweetName + "\n\tsweet cost"
				+ sweetCost;
	}

	public Sweet(int sweetId, String sweetName, float sweetCost) {
		super();
		this.sweetId = sweetId;
		this.sweetName = sweetName;
		this.sweetCost = sweetCost;
	}

}