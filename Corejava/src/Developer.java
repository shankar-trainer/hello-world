public class Developer {
  private int developerId;
  private int developerName;
  //private   final   String  developerConmpany="HCL";
  private   final   String  developerCompany;
  private int joiningMonth;
  private float salary;
  
  public Developer(int developerId, int developerName, String developerCompany,int joiningMonth, float salary) {
		this.developerId = developerId;
	this.developerName = developerName;
	this.developerCompany = developerCompany;
	this.joiningMonth=joiningMonth;
	this.salary=salary;
  }

public int getDeveloperId() {
	return developerId;
}

public void setDeveloperId(int developerId) {
	this.developerId = developerId;
}

public int getDeveloperName() {
	return developerName;
}

public void setDeveloperName(int developerName) {
	this.developerName = developerName;
}

public int getJoiningMonth() {
	return joiningMonth;
}

public void setJoiningMonth(int joiningMonth) {
	this.joiningMonth = joiningMonth;
}

public float getSalary() {
	return salary;
}

public void setSalary(float salary) {
	this.salary = salary;
}

public String getDeveloperCompany() {
	return developerCompany;
}
  
  
  
  
}
