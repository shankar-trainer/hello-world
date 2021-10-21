package corejava;

public class Employee {

	private int eid;//  data or attribute // private
	private String ename;
	private float salary;
	
	// behaviour or code  -- encapsulation  -- bind data+code
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public float getSalary() {
		return salary;
	}
	
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	
	
	
}
