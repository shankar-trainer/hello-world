
public class TrainingDepartment extends Department {
	private String trainingName;
	private int trainingDuration;

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public int getTrainingDuration() {
		return trainingDuration;
	}

	public void setTrainingDuration(int trainingDuration) {
		this.trainingDuration = trainingDuration;
	}

	
	@Override
	 public void departmentInfo() {
		super.departmentInfo();

	     System.out.println("\n\ttraining name is  "+getTrainingName());	 
	     System.out.println("\ttraining duration   is "+getTrainingDuration());	 
	 }
	
}
