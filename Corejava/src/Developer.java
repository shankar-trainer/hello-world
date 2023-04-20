public class Developer {
  private int developerId;
  private  String developerName;
  //private   final   String  developerConmpany="HCL";
  private   final   String  developerCompany;
  private int joiningMonth;
  private float salary;
  
  public Developer(int developerId, String developerName, String developerCompany,int joiningMonth, float salary) {
		this.developerId = developerId;
	this.developerName = developerName;
	this.developerCompany = developerCompany;
	this.joiningMonth=joiningMonth;
	this.salary=salary;
  }

  public static  void displayAllDeveoper(Developer[] developer){
	    System.out.println("\n******Developer Details****** "); 
	  for(Developer d:developer) {
		    System.out.println("\tid "+d.getDeveloperId());
		    System.out.println("\tname "+d.getDeveloperName());
		    System.out.println("\tname "+d.getDeveloperName());
		    System.out.println("\tjoinining month  "+d.getJoiningMonth());
		    System.out.println("\tsalary  "+d.getSalary());
	   }
  }
  
public int getDeveloperId() {
	return developerId;
}

public void setDeveloperId(int developerId) {
	this.developerId = developerId;
}

public String getDeveloperName() {
	return developerName;
}

public void setDeveloperName(String developerName) {
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
